package com.company.view;

import com.company.controller.ControllerPersoane;
import com.company.model.Persoana.Persoana;

import java.util.Scanner;

public class ViewLogin {
    Scanner scanner;
    ControllerPersoane controllerPersoane;

    public ViewLogin(){
        scanner=new Scanner(System.in);
        controllerPersoane=new ControllerPersoane();
    }

    private void meniu(){
        System.out.println("Apasati tasta 1 pentru : log in");
        System.out.println("Apasati tasta 2 pentru : inregistrare");
    }

    public void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){
                case 1 : login();
                break;


            }
        }
    }
    public void login(){
        System.out.println("Introduceti email-ul");
        String mail= scanner.nextLine();
        System.out.println("Introduceti parola");
        String pass= scanner.nextLine();
        Persoana persoana=controllerPersoane.verificareExistenta(mail,pass);
        if(persoana!=null){
            ViewClient viewClient=new ViewClient();
            viewClient.play();
        }
        else {
            System.out.println("Ati gresit mailul sau parola");
        }
    }

    public void inregistrare(){
        int id=controllerPersoane.nextPersonVlblId();
        System.out.println("Introduceti daca sunteti client sau angajat");
        String tip= scanner.nextLine();
        System.out.println("Intrroduceti numele : ");
        String nume=scanner.nextLine();
        System.out.println("Introduceti prenumele");
        String prenume= scanner.nextLine();
        System.out.println("Introduceti mailul");
        String mail= scanner.nextLine();
        System.out.println("Introduceti parola");
        String pass=scanner.nextLine();
        Persoana persoana=new Persoana(id,tip,nume,prenume,mail,pass);
        controllerPersoane.add(persoana);
        controllerPersoane.savePers();
    }


}
