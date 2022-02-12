package com.company.view;

import com.company.controller.ControllerCont;
import com.company.controller.ControllerPersoane;
import com.company.model.Cont.Cont;
import com.company.model.Cont.ContDebit;
import com.company.model.Persoana.Client;
import com.company.model.Persoana.Persoana;
import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewClient {
    //apsati tasata pentru a vedea conturile dvs
    //apsati tastat2 pentru a aface un transfer bancar
    //apsati tastat3 pentru a verifica soldul
    //apsati tasta4 pentru a aplica

    Scanner scanner;
    Client client;
    ControllerCont controllerCont;
    ArrayList<Cont>listaConturi;
    ControllerPersoane controllerPersoane;


    public ViewClient(){
        scanner=new Scanner(System.in);
        //client=new Client(22,"Alex","Popescu","alex@popescu","1234");
        controllerCont=new ControllerCont();
        listaConturi=controllerCont.getAccountsById(client.getId());
        controllerPersoane=new ControllerPersoane();
    }

    private void meniu(){
        System.out.println("apasati tasta 1 pentru : a verifica soldul");
        System.out.println("apasati tasta 2 pentru : a vedea conturile dumneavoastra");
        System.out.println("apasati tasta 3 pentru : a face un transfer bancar");
        System.out.println("apasati tasta 4 pentru : a aplica pentru un credit");
        System.out.println("apasati tasta 5 pentru : a vedea statusul unui credit");
    }
    public void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){

                case 1 : verificareSold();
                break;
                case 2 : afisareConturiClient();
                break;
                case 3 : transfer();
                break;
                case 4 : aplicareContCredit();
                break;

            }
        }
    }

    public void verificareSold(){

        System.out.println("soldul este " + controllerCont.returnareSold(22) );

    }


    public void afisareConturiClient(){
        listaConturi.stream().forEach(System.out::println);//streamuri

    }


    public void transfer(){
        System.out.println("Introduceti numarul de cont pentru transfer : ");
        int acc=Integer.parseInt(scanner.nextLine());
        if(controllerCont.verificareExistentaCont(acc)!=null){
            Cont cont2=controllerCont.verificareExistentaCont(acc);
            System.out.println("Contul a fost gasit, introduceti suma : ");
            Double suma=Double.parseDouble(scanner.nextLine());
            if(suma>controllerCont.returnareSold(client.getId())){
                System.out.println("suma introdusa depaseste soldul");
            }else
            {
                controllerCont.transfer(controllerCont.returnCont(client.getId()).getAccnumber(),cont2.getAccnumber(),suma);
            }


        }

    }

    public void aplicareContCredit() {
        System.out.println("Introduceti salarul in RON");
        int salar = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti experienta de lucru");
        int exp = Integer.parseInt(scanner.nextLine());
        if (salar < 2000 && exp < 1) {
            System.out.println("salarul dvs este prea mic/aveti prea putina experienta");
        } else {
            int id = controllerPersoane.nextPersonVlblId();
            String tip = "Client";
            System.out.println("Introduceti numele");
            String nume = scanner.nextLine();
            System.out.println("Introduceti prenumele");
            String prenume = scanner.nextLine();
            System.out.println("Introduceti mailul");
            String mail = scanner.nextLine();
            System.out.println("Introduceti parola");
            String pass = scanner.nextLine();
            System.out.println("Introduceti valoarea creditului");
            int credit = Integer.parseInt(scanner.nextLine());
            controllerCont.creareCont("credit", id, credit);

        }
    }


    public void statusCredit(){
        System.out.println("Introduceti nr de cont");
        int accnr=Integer.parseInt(scanner.nextLine());
        if(controllerCont.verificareExistentaCont(accnr)!=null){
            Cont cont=controllerCont.verificareExistentaCont(accnr);
            System.out.println("balanta contului este " + cont.getBalance());
            System.out.println();
        }
    }


}
