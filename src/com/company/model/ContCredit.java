package com.company.model;

public class ContCredit extends Cont{
    private int sumaCredit;
    public ContCredit(int idCont,int idClient,int sumaCredit){
        super(idCont,"Credit",idClient);
        this.sumaCredit=sumaCredit;
    }

    public void setSumaCredit(int sumaCredit) {
        this.sumaCredit = sumaCredit;
    }

    public int getSumaCredit() {
        return this.sumaCredit;
    }
    public ContCredit(String line){
        super(line);
        this.sumaCredit=Integer.parseInt(line.split(",")[3]);
    }
    @Override
    public String toSaveCont(){
        String text=super.toSaveCont() + "," + sumaCredit;
        return text;
    }
}
