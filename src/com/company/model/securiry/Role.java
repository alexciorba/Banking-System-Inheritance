package com.company.model.securiry;

import com.company.model.securiry.Persmissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.company.model.securiry.Persmissions.*;

public enum Role {

      CLIENT_ROLE(Arrays.asList(CONT_READ,CONT_DELETE)),
      ANGAJAT_ROLE(Arrays.asList(CONT_READ,CONT_WRITE,CONT_UPDATE,CONT_DELETE));
         private  final List<Persmissions> persmissions;
        Role(List<Persmissions> persmissions) {
           this.persmissions = persmissions;
        }

    public List<Persmissions> getPersmissions() {
        return persmissions;
    }
}
