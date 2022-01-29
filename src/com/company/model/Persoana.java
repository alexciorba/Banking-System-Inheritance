package com.company.model;

public class Persoana {

    private int id;
    private String nume;
    private String prenume;
    private String tip;

    public Persoana(int id,String tip,String nume,String prenume){
        this.id=id;
        this.tip=tip;
        this.nume=nume;
        this.prenume=prenume;
    }

    public Persoana(String line){
        this(Integer.parseInt(line.split(",")[0]),
                line.split(",")[1],
                line.split(",")[2],
                line.split(",")[3]);
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return this.nume;
    }

    public String getTip() {
        return this.tip;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public int getId() {
        return this.id;
    }

    public String descrierePersoana(){
        String text="";
        text+="id : " + id + "\n";
        text+="tipul : " + tip + "\n";
        text+="nume : " + nume + "\n" ;
        text+="prenume : " + prenume +"\n";
        return  text;
    }

    public String toSave(){
        String text=id + "," + tip + "," + nume +"," +prenume;
        return  text;
    }


}
