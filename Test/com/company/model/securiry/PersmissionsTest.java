package com.company.model.securiry;

import com.company.model.Persoana.Angajat;
import com.company.model.Persoana.Client;
import org.junit.jupiter.api.Test;

import static com.company.model.securiry.Persmissions.CONT_UPDATE;
import static com.company.model.securiry.Persmissions.CONT_WRITE;
import static org.junit.jupiter.api.Assertions.*;

class PersmissionsTest {

    @Test

    void testPermisiuni(){
        Angajat angajat=new Angajat(22,"nume","prenume","jhfwe","gdefejf");
        assertEquals(true,angajat.getRole().getPersmissions().contains(CONT_UPDATE));

        Client client=new Client(77,"nume1","prenume1","@gjoijg","fhwoeih");
        assertEquals(false,client.getRole().getPersmissions().contains(CONT_WRITE));
    }

}