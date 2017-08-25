package com.example.administrator.mycollegeguide.model;

import java.util.UUID;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class MajorModel {

    private String name;
    private String department;
    private UUID id;


    public MajorModel(){
        id = UUID.randomUUID();
    }



    public MajorModel(String name, String department) {
        this();
        this.name = name;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
