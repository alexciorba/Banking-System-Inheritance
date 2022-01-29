package com.company.model;

public class Angajat extends Persoana{

    public Angajat(int id,String nume,String prenume){
        super(id,"angajat",nume,prenume);
    }

    public  Angajat(String line){
        super(line);
    }

    @Override
    public  String toSave(){
        String text=super.descrierePersoana();
        return  text;
    }
}
