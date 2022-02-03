package com.company.model.Persoana;

public class Persoana {

    private int id;
    private String nume;
    private String prenume;
    private String tip;
    private String mail;
    private String pass;

    public Persoana(int id, String tip, String nume, String prenume,String mail,String pass){
        this.mail=mail;
        this.pass=pass;
        this.tip=tip;
        this.nume=nume;
        this.prenume=prenume;
        this.id=id;
    }

    public Persoana(String line){
        this(Integer.parseInt(line.split(",")[0]),
                line.split(",")[1],
                line.split(",")[2],
                line.split(",")[3],
                line.split(",")[4],
                line.split(",")[5]);
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

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public String getPass() {
        return pass;
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
        text+="id USER: " + id + "\n";
        text+="tipul : " + tip + "\n";
        text+="nume : " + nume + "\n" ;
        text+="prenume : " + prenume +"\n";

        return  text;
    }

    public String toString(){
        String text= id + "," + tip + "," + nume +"," +prenume ;
        return  text;
    }

    public boolean equals(Object o){
        Persoana p=(Persoana) o;
        return p.getId()==this.id && p.getNume().equals(this.nume) && p.getPrenume().equals(this.prenume) && p.getTip().equals(this.tip) ;
    }

}
