package com.company.model.Cont;

public class ContDebit extends Cont{

    public ContDebit(int idCont,int idClient,int suma,int accnumber,int balance){
        super(idCont,"debit",idClient,accnumber,balance);

    }



    public ContDebit(String line){
        super(line);

    }

    @Override
    public String toString(){
        String text=super.toString() ;
        return text;
    }
}
