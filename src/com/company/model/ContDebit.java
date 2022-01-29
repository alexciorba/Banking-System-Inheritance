package com.company.model;

public class ContDebit extends Cont{
    private int suma;
    public ContDebit(int idCont,int idClient,int suma){
        super(idCont,"debit",idClient);
        this.suma=suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getSuma() {
        return this.suma;
    }

    public ContDebit(String line){
        super(line);
        this.suma=Integer.parseInt(line.split(",")[3]);
    }

    @Override
    public String toSaveCont(){
        String text=super.toSaveCont() + "," + suma;
        return text;
    }
}
