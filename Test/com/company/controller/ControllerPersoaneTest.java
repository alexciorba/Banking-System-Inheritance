package com.company.controller;

import com.company.model.Persoana.Angajat;
import com.company.model.Persoana.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerPersoaneTest {

    @Test

    void testToString(){
        Angajat angajat=new Angajat(12,"marinel","ion","@jbjc","passs");
        ControllerPersoane controllerPersoane=new ControllerPersoane();
        controllerPersoane.add(angajat);
        String expected="12,angajat,marinel,ion" + "\n";
        assertEquals(expected,controllerPersoane.toString());
    }

    @Test

    void verificareLoad(){
        ControllerPersoane controllerPersoane=new ControllerPersoane();
        assertEquals(3,controllerPersoane.verifAngajati());
        assertEquals(1,controllerPersoane.verifClienti());
    }

}