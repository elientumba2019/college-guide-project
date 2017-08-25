package com.example.administrator.mycollegeguide.model;

import android.graphics.drawable.Drawable;

import java.util.UUID;

/**
 * Created by Administrator on 2017/8/17 0017.
 */

public class Teacher {

    private UUID id;
    private int teacherPhoto;//take his reference from the drawable directory
    private String teacherPhone;
    private String teacherName;
    private String teacherOffice;
    private String teacherEmail;



    public Teacher(){
        id = UUID.randomUUID();
    }


    public Teacher(int teacherPhoto, String teacherName, String teacherOffice, String teacherEmail, String teacherPhone) {
        this();
        this.teacherPhoto = teacherPhoto;
        this.teacherName = teacherName;
        this.teacherOffice = teacherOffice;
        this.teacherEmail = teacherEmail;
        this.teacherPhone = teacherPhone;
    }

    public int getTeacherPhoto() {
        return teacherPhoto;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setTeacherPhoto(int teacherPhoto) {
        this.teacherPhoto = teacherPhoto;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherOffice() {
        return teacherOffice;
    }

    public void setTeacherOffice(String teacherOffice) {
        this.teacherOffice = teacherOffice;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }
}
