package com.company.controller;

import com.company.model.Cont.ContCredit;
import com.company.model.Cont.ContDebit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerContTest {

    @Test

    void testToString(){

        ContDebit contDebit=new ContDebit(222,223,100,32,12);
        ContCredit contCredit=new ContCredit(345,33,240,21);
        ControllerCont cont=new ControllerCont();
        cont.add(contCredit);
        cont.add(contDebit);
        String expected="345,Credit,33,240" + "\n";
        expected+="222,debit,223,100" + "\n";
        assertEquals(expected,cont.toString());
    }



}