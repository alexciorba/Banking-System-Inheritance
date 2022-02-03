package com.company.model.Cont;

public class Cont {

    private int idCont;
    private String tip;
    private int idClient;
    private int accnumber;
    private double balance;


    public Cont(int idCont,String tip,int idClient,int accnumber,int balance){
        this.idCont=idCont;
        this.tip=tip;
        this.idClient=idClient;
        this.accnumber=accnumber;
        this.balance=balance;
    }
    public Cont(String line) {
        this(Integer.parseInt(line.split(",")[0]),
                line.split(",")[1],
                Integer.parseInt(line.split(",")[2]),
                Integer.parseInt(line.split(",")[3]),
                Integer.parseInt(line.split(",")[4]));
    }

    public void setAccnumber(int accnumber) {
        this.accnumber = accnumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setIdCont(int idCont) {
        this.idCont = idCont;
    }

    public String getTip() {
        return this.tip;
    }

    public int getIdClient() {
        return this.idClient;
    }

    public int getIdCont() {
        return this.idCont;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccnumber() {
        return accnumber;
    }

    public String descriereCont(){
        String text="";
        text+="id cont : " + idCont + "\n";
        text+="tip cont : " + tip + "\n";
        text+="id client : " + idClient + "\n";
        text+="nr cont : " + accnumber + "\n";
        text+="sold : " + balance + "\n";
        return text;
    }
    public String toString(){
        String text=idCont + "," + tip + "," + idClient + "," + accnumber + "," + balance;
        return  text;
    }

    public boolean equals(Object o){
        Cont x=(Cont) o;
        return x.getTip().equals(this.tip) && x.getIdCont()==this.idCont && x.getIdClient()==this.idClient;

    }
}
