package com.company.model;

public class Client extends Persoana{

    public  Client(int id,String nume,String prenume){
        super(id,"client",nume,prenume);
    }

    public Client(String line){
        super(line);
    }

    @Override
    public String toSave(){
        String text=super.descrierePersoana();
        return text;
    }
}
