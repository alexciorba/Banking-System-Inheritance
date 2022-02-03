package com.company.model.Persoana;

import com.company.model.securiry.Role;

public class Client extends Persoana{

    private Role  role;
    public  Client(int id,String nume,String prenume,String mail,String pass){
        super(id,"client",nume,prenume,mail,pass);
        role=Role.CLIENT_ROLE;
    }

    public Client(String line){
        super(line);
    }

    @Override
    public String toString(){
        String text=super.toString();
        return text;
    }

    public Role getRole() {
        return role;
    }
}
