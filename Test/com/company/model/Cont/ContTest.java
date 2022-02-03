package com.company.model.Cont;

import com.company.model.Persoana.Angajat;
import com.company.model.Persoana.Persoana;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContTest {

    @Test

    void testToString(){

        Angajat angajat=new Angajat(2,"Alex","Ciorba","@jdhkds","djkjd");
        String expected="2,angajat,Alex,Ciorba";
        assertEquals(expected,angajat.toString());

    }
    @Test
    void testEquals(){
        Cont cont=new Cont(2,"debit",3,2,200);
        Cont cont1=new Cont(2,"debit",3,22,123);
        assertEquals(true,cont.equals(cont1));


        ArrayList<Cont> conts=new ArrayList<>();
        Cont c1=new Cont(3,"credit",6,12,45);
        Cont c2=new Cont(9,"credit",77,34,23);
        Cont c3=new Cont(76,"debit",100,78,1234);
        Cont c4=new Cont(123,"credit",56,37,22);
        conts.add(c1);
        conts.add(c2);
        conts.add(c3);
        conts.add(c4);



        assertEquals(0,conts.indexOf(new Cont(3,"credit",6,12,45)));



    }

}