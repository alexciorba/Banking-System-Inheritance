package com.company.model.securiry;

public enum Persmissions {

        CONT_READ("cont:read"),
        CONT_WRITE("cont:write"),
        CONT_UPDATE("cont:update"),
        CONT_DELETE("cont:delete");


    private final String permission;

        Persmissions(String permission){

            this.permission=permission;
        }

        public  String getPermission(){

            return  this.permission;

        }

}
