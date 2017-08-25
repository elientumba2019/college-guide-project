package com.example.administrator.mycollegeguide.temp_singleton;

import android.content.Context;

import com.example.administrator.mycollegeguide.R;
import com.example.administrator.mycollegeguide.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class TeacherFactory {

    private static TeacherFactory teacherFactory;

    private List<Teacher> teachers;


    private TeacherFactory(Context context){
        teachers = new ArrayList<>();
        addData();

    }


    public static TeacherFactory getInstace(Context context){
        if (teacherFactory == null){
            teacherFactory = new TeacherFactory(context);
            return teacherFactory;
        }
        return teacherFactory;
    }


    public List<Teacher> getTeachers(){
        return teachers;
    }


    public Teacher getTeacher(UUID id){
        for (Teacher teacher : teachers){
            if (teacher.getId().equals(id)){
                return teacher;
            }
        }
        return null;
    }


    /**
     * add data to factory
     */
    public void addData(){

        teachers.add(new Teacher(R.drawable.teacherone, "li pai", "21-202", "1234@aa.com", "102939"));
        teachers.add(new Teacher(R.drawable.teachertwo, "leon duv", "14-102", "4567@aa.com", "767939"));
        teachers.add(new Teacher(R.drawable.teacherthree, "sarah chen", "29-313", "9097@aa.com", "345112"));
        teachers.add(new Teacher(R.drawable.teacherfour, "lia kuan", "11-404", "4563@aa.com", "243539"));
        teachers.add(new Teacher(R.drawable.teacherfive, "martha bae", "17-117", "4377@aa.com", "576360"));

    }
}
