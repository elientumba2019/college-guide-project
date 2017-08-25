package com.example.administrator.mycollegeguide.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.administrator.mycollegeguide.model.Competitions;
import com.example.administrator.mycollegeguide.model.Student;

/**
 * Created by Administrator on 2017/8/17 0017.
 */

public class MyCollegeGuideHelper extends SQLiteOpenHelper {

    //name and version of the database
    public static final String DB_NAME = "CollegeGuide.db";
    public static final int VERSION = 1;

    public MyCollegeGuideHelper(Context context){
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //student table
        sqLiteDatabase.execSQL("create table " + Schema.StudentTable.TABLE_NAME + "(" +
                Schema.StudentTable.Columns.STUDENT_ID + " primary key autoincrement, " +
            Schema.StudentTable.Columns.PSEUDO + ", " +
            Schema.StudentTable.Columns.SURNAME + ", " +
            Schema.StudentTable.Columns.GIVEN_NAME + ", " +
            Schema.StudentTable.Columns.GRADE + ", " +
                Schema.StudentTable.Columns.MAJOR + ", " +
                Schema.StudentTable.Columns.DEPARTMENT + ", " +
                Schema.StudentTable.Columns.DEGREE + ", " +
                Schema.StudentTable.Columns.EMAIL + ", " +
                Schema.StudentTable.Columns.PASSWORD + ", " +
                Schema.StudentTable.Columns.SECURITY_QUESTION + ", " +
                Schema.StudentTable.Columns.SECURITY_ANSWER + ")");




        //teacher table
        sqLiteDatabase.execSQL("create table" + Schema.TeacherTable.TABLE_NAME + "(" +
                Schema.TeacherTable.Columns.TEACHER_ID + " primary key autoincrement, " +
                Schema.TeacherTable.Columns.NAME + ", " +
                Schema.TeacherTable.Columns.OFFICE + ", " +
                Schema.TeacherTable.Columns.EMAIL + ", " +
                Schema.TeacherTable.Columns.PHONE + ")");




        sqLiteDatabase.execSQL("create table" + Schema.CourseTable.TABLE_NAME + "(" +
                Schema.CourseTable.Columns.ID + ", " +
                Schema.CourseTable.Columns.NAME + ", " +
                Schema.CourseTable.Columns.SEMESTER + ", " + ")");




        sqLiteDatabase.execSQL("create table" + Schema.CompetitionTable.TABLE_NAME + "(" +
                Schema.CompetitionTable.Columns.ID + ", " +
                Schema.CompetitionTable.Columns.NAME + ", " +
                Schema.CompetitionTable.Columns.REQUIREMENT + ")");




        sqLiteDatabase.execSQL("create table" + Schema.OfficeTable.TABLE_NAME + "(" +
                Schema.OfficeTable.Columns.OFFICE_NUMBER + ", " +
                Schema.OfficeTable.Columns.OFFICE_ROLE + ", " +
                Schema.OfficeTable.Columns.COLLEGE + ")");




        sqLiteDatabase.execSQL("create table" + Schema.OfficeTeacherTable.TABLE_NAME + "(" +
                Schema.OfficeTeacherTable.Columns.ID + ", " +
                Schema.OfficeTeacherTable.Columns.NAME + ", " +
                Schema.OfficeTeacherTable.Columns.OFFICE_NUMBER + "foreign key(" +
                            Schema.OfficeTeacherTable.Columns.OFFICE_NUMBER + ") references"
                            +Schema.OfficeTable.TABLE_NAME + "(" + Schema.OfficeTable.Columns.OFFICE_NUMBER + ")"

        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
