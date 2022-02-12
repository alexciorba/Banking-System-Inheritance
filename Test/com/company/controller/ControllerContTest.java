package com.company.controller;

import com.company.model.Cont.ContCredit;
import com.company.model.Cont.ContDebit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerContTest {

    @Test

    void testToString(){

        ContDebit contDebit=new ContDebit(222,223,100,32,12);
        ContCredit contCredit=new ContCredit(345,33,240,21,3,2000);
        ControllerCont cont=new ControllerCont();
        cont.add(contCredit);
        cont.add(contDebit);
        String expected="345,Credit,33,240" + "\n";
        expected+="222,debit,223,100" + "\n";
        assertEquals(expected,cont.toString());
    }


   @Test

    void testTransfer(){
        ContDebit contDebit=new ContDebit(123,22,125,111,300);
        ContDebit contDebit1=new ContDebit(128,4545,6574,66667,400);
        ControllerCont controllerCont=new ControllerCont();
        controllerCont.add(contDebit);
        controllerCont.add(contDebit1);
        controllerCont.transfer(111,66667,100);
        assertEquals(200,contDebit.getBalance());
        assertEquals(500, contDebit1.getBalance());
   }
}