package com.company.controller;

import com.company.model.Persoana.Angajat;
import com.company.model.Persoana.Client;
import com.company.model.Persoana.Persoana;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerPersoane {
    private ArrayList<Persoana> listaPersoane;

    public ControllerPersoane(){
        listaPersoane=new ArrayList<>();
        load();
    }

    public void load(){
        try{

            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\ProiectBanking\\src\\com\\company\\source\\persoane.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                switch (line.split(",")[1]){
                    case "angajat":
                        this.listaPersoane.add(new Angajat(line));
                        break;
                    case "client" :
                        this.listaPersoane.add(new Client(line));

                        break;



                }
            }
        }catch (Exception e){

        }
    }

    public String toString(){
        String text="";
        for(Persoana p:listaPersoane){
            text+=p + "\n";
        }
        return text;
    }

    public void savePers() {
        File file = new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\ProiectBanking\\src\\com\\company\\source\\persoane.txt");
        try {

            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print(toString());
            printWriter.close();

        } catch (Exception e) {

        }
    }
    public void add(Persoana p){
        listaPersoane.add(p);
    }

    //facem o functie care verifica cati angajati avem

    public int verifAngajati(){
        int cont=0;
        for(Persoana persoana : listaPersoane){
            if(persoana instanceof Angajat){
                cont++;

            }
        }
        return cont;
    }
    public int verifClienti(){
        int cont=0;
        for(Persoana persoana : listaPersoane){
            if(persoana instanceof Client){
                cont++;

            }
        }
        return cont;
    }
public int nextPersonVlblId(){
        if(listaPersoane.size()!=0){
            return listaPersoane.get(listaPersoane.size()-1).getId()+1;
        }return 1;
}

//facem o functie care verifica daca exista o persoana cu mailul si parola data

    public Persoana verificareExistenta(String mail,String pass){
        for(Persoana persoana : listaPersoane){
            if(persoana.getMail().equals(mail) && persoana.getPass().equals(pass)){
                return persoana;
            }

        }
        return null;
    }
}
