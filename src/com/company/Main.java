package com.company;

import com.company.model.Cont.Cont;
import com.company.model.Persoana.Angajat;
import com.company.model.Persoana.Client;
import com.company.model.securiry.Persmissions;

import static com.company.model.securiry.Persmissions.*;

public class Main {

    public static void main(String[] args) {


        Client client=new Client(90,"Alex","Mihai","@friogj","fhwefh");
        Angajat angajat=new Angajat(24,"ana","maria","@yahoo","pass");


        System.out.println(client.getRole().getPersmissions().contains(CONT_UPDATE));
        System.out.println(client.getRole().getPersmissions().contains(CONT_DELETE));




    }
}
