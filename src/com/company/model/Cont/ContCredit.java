package com.company.model.Cont;

public class ContCredit extends Cont{

    public ContCredit(int idCont,int idClient,int accnumber,int balance){
        super(idCont,"Credit",idClient,accnumber,balance);

    }


    public ContCredit(String line){
        super(line);

    }
    @Override
    public String toString(){
        String text=super.toString() ;
        return text;
    }
}
