package com.company.controller;

import com.company.model.Cont.Cont;
import com.company.model.Cont.ContCredit;
import com.company.model.Cont.ContDebit;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCont {
    private ArrayList<Cont>listaConturi;

    public ControllerCont(){
        listaConturi=new ArrayList<>();
        load();
    }


    public Cont getContByAccNumber(int accnr){
        for(Cont cont : listaConturi){
            if(cont.getAccnumber()==accnr){
                return cont;
            }
        }
        return null;
    }
    public void load(){
        try{

            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\ProiectBanking\\src\\com\\company\\source\\cont.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                switch (line.split(",")[1]){
                    case "credit":
                        this.listaConturi.add(new ContCredit(line));
                        break;
                    case "debit" :
                        this.listaConturi.add(new ContDebit(line));

                        break;



                }
            }
        }catch (Exception e){

        }
    }

    @Override
    public String toString(){
        String text="";
        for(Cont c:listaConturi){
            text+=c + "\n";
        }
        return text;
    }

    public void saveCont() {
        File file = new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\ProiectBanking\\src\\com\\company\\source\\cont.txt");
        try {

            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print(toString());
            printWriter.close();

        } catch (Exception e) {

        }
    }

    public void add(Cont cont){
        listaConturi.add(cont);
    }
    // o functie care primeste id persoana si returneaza contul , returneaza soldul


    public double returnareSold(int id){
        for (Cont cont : listaConturi){
            if(cont.getIdClient()==id){
                return  cont.getBalance();


            }
        }
        return 0;
    }

    // o functie care afiseaza conturile unui user


    public ArrayList<Cont> getAccountsById(int id){
        ArrayList<Cont>lista2Conturi;
        lista2Conturi=new ArrayList<>();
        for(Cont cont : listaConturi){
            if(cont.getIdClient()==id){
                lista2Conturi.add(cont);
            }
        }
        return lista2Conturi;
    }

    // facem o functie care primeste accnumber si verifica daca acc exista

    public Cont verificareExistentaCont(int accNumber){
        for(Cont cont : listaConturi){
            if(cont.getAccnumber()==accNumber){
                return cont;
            }
        }
        return null;
    }


    //facem o functie care scade "suma" din balance

    public void scadereSuma(int id,double suma){
        for(Cont cont : listaConturi){
            if(cont.getIdClient()==id){
                cont.setBalance(cont.getBalance()-suma);
            }
        }
    }

    //facem o functie care aduna "suma" din balance


    public void adunareSuma(int id,double suma){
        for(Cont cont : listaConturi){
            if(cont.getAccnumber()==id){
                cont.setBalance(cont.getBalance()+suma);
            }
        }
    }



    public  void  transfer(int from,int to ,double amount){
        Cont f =this.getContByAccNumber(from);
        Cont t=this.getContByAccNumber(to);
        t.setBalance(t.getBalance()+amount);
        f.setBalance(f.getBalance()-amount);



    }
    // functie care primeste id client si reurneaza contul


    public Cont returnCont(int clientid){
        for(Cont cont : listaConturi){
            if(cont.getIdClient()==clientid){
                return cont;
            }
        }
        return null;
    }

    public int nextPersonVlblId(){
        if(listaConturi.size()!=0){
            return listaConturi.get(listaConturi.size()-1).getIdCont()+1;
        }return 1;
    }
    public int nextPersonVlbAcxNumber(){
        if(listaConturi.size()!=0){
            return listaConturi.get(listaConturi.size()-1).getAccnumber()+1;
        }return 1;
    }
    // implementare conditii pt a deschide un cont de credit

    // - salar mai mare de 2000 ron
    // - experienta mai mare de 1 an


    public Cont creareCont(String tip,int idclient,int balance){

        Cont cont=new Cont(nextPersonVlblId(),tip,idclient,nextPersonVlbAcxNumber(),balance);
        return cont;
    }



}
