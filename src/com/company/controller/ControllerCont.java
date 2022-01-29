package com.company.controller;

import com.company.model.Cont;
import com.company.model.ContCredit;
import com.company.model.ContDebit;

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

    public String toSveCont(){
        String text="";
        for(Cont c:listaConturi){
            text+=c.toSaveCont()+ "\n";
        }
        return text;
    }

    public void saveCont() {
        File file = new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\ProiectBanking\\src\\com\\company\\source\\cont.txt");
        try {

            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print(toSveCont());
            printWriter.close();

        } catch (Exception e) {

        }
    }

}
