package com.company.model;

public class Cont {

    private int idCont;
    private String tip;
    private int idClient;

    public Cont(int idCont,String tip,int idClient){
        this.idCont=idCont;
        this.tip=tip;
        this.idClient=idClient;
    }
    public Cont(String line) {
        this(Integer.parseInt(line.split(",")[0]),
                line.split(",")[1],
                Integer.parseInt(line.split(",")[2]));
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
    public String descriereCont(){
        String text="";
        text+="id cont : " + idCont + "\n";
        text+="tip cont : " + tip + "\n";
        text+="id client : " + idClient + "\n";
        return text;
    }
    public String toSaveCont(){
        String text=idCont + "," + tip + "," + idClient;
        return  text;
    }
}
