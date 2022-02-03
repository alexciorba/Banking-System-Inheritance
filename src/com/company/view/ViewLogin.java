package com.company.view;

import java.util.Scanner;

public class ViewLogin {
    Scanner scanner;

    public ViewLogin(){
        scanner=new Scanner(System.in);
    }

    private void meniu(){
        System.out.println("Apasati tasta 1 pentru : log in");
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
