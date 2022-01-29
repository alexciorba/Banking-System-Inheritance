package com.company.controller;

import com.company.model.*;

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

    public String toSvePers(){
        String text="";
        for(Persoana p:listaPersoane){
            text+=p.toSave()+ "\n";
        }
        return text;
    }

    public void saveCont() {
        File file = new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\ProiectBanking\\src\\com\\company\\source\\persoane.txt");
        try {

            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print(toSvePers());
            printWriter.close();

        } catch (Exception e) {

        }
    }
}
