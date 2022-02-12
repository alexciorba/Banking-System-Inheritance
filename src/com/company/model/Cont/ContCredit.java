package com.company.model.Cont;

public class ContCredit extends Cont{


    int nrRate;
    int sumaImprutata;

    public ContCredit(int idCont,int idClient,int accnumber,int balance,int nrRate,int sumaImprutata){
        super(idCont,"Credit",idClient,accnumber,balance);
        this.nrRate=nrRate;
        this.sumaImprutata=sumaImprutata;


    }

    public void setNrRate(int nrRate) {
        this.nrRate = nrRate;
    }

    public int getNrRate() {
        return nrRate;
    }

    public void setSumaImprutata(int sumaImprutata) {
        this.sumaImprutata = sumaImprutata;
    }

    public int getSumaImprutata() {
        return sumaImprutata;
    }

    public ContCredit(String line){
        super(line);
        this.nrRate=Integer.parseInt(line.split(",")[6]);
        this.sumaImprutata=Integer.parseInt(line.split(",")[7]);

    }
    @Override
    public String toString(){
        String text=super.toString() ;
        text+="nr rate" + nrRate + "\n";
        text+="suma imprumutata" + sumaImprutata + "\n";
        return text;
    }
}
