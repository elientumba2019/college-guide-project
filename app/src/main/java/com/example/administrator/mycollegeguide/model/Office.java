package com.example.administrator.mycollegeguide.model;

import java.util.UUID;

/**
 * Created by Administrator on 2017/8/17 0017.
 */

public class Office {

    private UUID id;
    private String officeNumber;
    private String officeRole;
    private String name;
    private String college;


    public Office(){
        id = UUID.randomUUID();
    }



    public Office(String officeNumber, String officeRole, String name, String college) {
        this();
        this.officeNumber = officeNumber;
        this.officeRole = officeRole;
        this.name = name;
        this.college = college;
    }




    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOfficeRole() {
        return officeRole;
    }

    public void setOfficeRole(String officeRole) {
        this.officeRole = officeRole;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
