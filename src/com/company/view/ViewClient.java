package com.company.view;

import java.util.Scanner;

public class ViewClient {
    //apsati tasata pentru a vedea conturile dvs
    //apsati tastat2 pentru a aface un transfer bancar
    //apsati tastat3 pentru a verifica soldul
    //apsati tasta4 pentru a aplica

    Scanner scanner;

    public ViewClient(){
        scanner=new Scanner(System.in);
    }

    private void meniu(){
        System.out.println("apasati tasta 1 pentru : a verifica soldul");
        System.out.println("apasati tasta 2 pentru : a vedea conturile dumneavoastra");
        System.out.println("apasati tasta 3 pentru : a face un transfer bancar");
        System.out.println("apasati tasta 4 pentru : a aplica pentru un credit");
    }

    public void play(){
        boolean running=true;
        while (running){
            meniu();
            int alegere=Integer.parseInt(scanner.nextLine());
            switch (alegere){

            }
        }
    }


}
