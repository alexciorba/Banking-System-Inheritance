package com.company.model.Persoana;

import com.company.model.securiry.Role;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.swing.plaf.PanelUI;

public class Angajat extends Persoana{

    private Role role;

    public Angajat(int id,String nume,String prenume,String mail,String pass){
        super(id,"angajat",nume,prenume,mail,pass);
        role=Role.ANGAJAT_ROLE;
    }

    public  Angajat(String line){
        super(line);
    }

    @Override
    public  String toString(){
        String text=super.toString();
        return  text;
    }

    public Role getRole() {
        return role;
    }
}
