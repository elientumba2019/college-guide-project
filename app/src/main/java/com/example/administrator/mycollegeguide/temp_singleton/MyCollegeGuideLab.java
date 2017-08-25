package com.example.administrator.mycollegeguide.temp_singleton;

/**
 * Created by Administrator on 2017/8/17 0017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.administrator.mycollegeguide.database.MyCollegeGuideHelper;
import com.example.administrator.mycollegeguide.database.Schema;
import com.example.administrator.mycollegeguide.model.Competitions;
import com.example.administrator.mycollegeguide.model.Courses;
import com.example.administrator.mycollegeguide.model.Office;
import com.example.administrator.mycollegeguide.model.OfficeTeacher;
import com.example.administrator.mycollegeguide.model.Student;
import com.example.administrator.mycollegeguide.model.Teacher;

/**
 * this class open the database and check its version
 */

public class MyCollegeGuideLab {

    private static MyCollegeGuideLab myCollegeGuideLab;


    private Context mContext;
    private SQLiteDatabase mDatabase;
    private static ContentValues values;




    private MyCollegeGuideLab(Context context){
        mContext = context.getApplicationContext();
        mDatabase = new MyCollegeGuideHelper(mContext).getWritableDatabase();
    }




    /**
     * putting data into content values to add them in the database
     * @param student
     * @return
     */
    private static ContentValues getStudentValues(Student student){

        values = new ContentValues();

        //students values
        values.put(Schema.StudentTable.Columns.PSEUDO, student.getPsoeudo());
        values.put(Schema.StudentTable.Columns.STUDENT_ID, student.getStudent_id());
        values.put(Schema.StudentTable.Columns.SURNAME, student.getSurname());
        values.put(Schema.StudentTable.Columns.GIVEN_NAME, student.getGivenName());
        values.put(Schema.StudentTable.Columns.GRADE, student.getGrade());
        values.put(Schema.StudentTable.Columns.DEGREE, student.getDegree());
        values.put(Schema.StudentTable.Columns.DEPARTMENT, student.getDepartment());
        values.put(Schema.StudentTable.Columns.MAJOR, student.getMajor());
        values.put(Schema.StudentTable.Columns.EMAIL, student.getEmail());
        values.put(Schema.StudentTable.Columns.PASSWORD, student.getPassword());
        values.put(Schema.StudentTable.Columns.SECURITY_QUESTION, student.getSecurityQuestion());
        values.put(Schema.StudentTable.Columns.SECURITY_ANSWER, student.getSecurityAnswer());


        return values;

    }



    private static ContentValues getTeacherValues(Teacher teacher){

        //teacher values

        values = new ContentValues();


        values.put(Schema.TeacherTable.Columns.NAME, teacher.getTeacherName());
        values.put(Schema.TeacherTable.Columns.OFFICE, teacher.getTeacherOffice());
        values.put(Schema.TeacherTable.Columns.EMAIL, teacher.getTeacherEmail());
        values.put(Schema.TeacherTable.Columns.PHONE, teacher.getTeacherPhone());

        return values;
    }



    private static ContentValues getCourseValues(Courses courses){

        values = new ContentValues();

        //courses values
        values.put(Schema.CourseTable.Columns.ID, courses.getCourseId());
        values.put(Schema.CourseTable.Columns.NAME, courses.getCourseName());
        values.put(Schema.CourseTable.Columns.SEMESTER, courses.getCourseSemester());

        return values;
    }



    private static ContentValues getCompetitionValues(Competitions competitions){

        values = new ContentValues();

        //competition values
        values.put(Schema.CompetitionTable.Columns.ID, competitions.getCompetitionId());
        values.put(Schema.CompetitionTable.Columns.NAME, competitions.getCompetitionName());
        values.put(Schema.CompetitionTable.Columns.REQUIREMENT, competitions.getCompetitionRequirement());

        return values;

    }


    private static ContentValues getOfficeValues(Office office){

        values = new ContentValues();

        //office values
        values.put(Schema.OfficeTable.Columns.OFFICE_NUMBER, office.getOfficeNumber());
        values.put(Schema.OfficeTable.Columns.OFFICE_ROLE, office.getOfficeRole());
        values.put(Schema.OfficeTable.Columns.COLLEGE, office.getCollege());

        return values;
    }



    private static ContentValues getOfficeTeacherValues(OfficeTeacher officeTeacher){
        values = new ContentValues();

        //officeTeacher
        values.put(Schema.OfficeTeacherTable.Columns.ID, officeTeacher.getId());
        values.put(Schema.OfficeTeacherTable.Columns.NAME, officeTeacher.getName());
        values.put(Schema.OfficeTeacherTable.Columns.OFFICE_NUMBER, officeTeacher.getOfficeNumber());

        return values;
    }




    /**
     * add values into the database
     */


    //student
    public void addStudents(Student student){
        ContentValues values = getStudentValues(student);

        mDatabase.insert(Schema.StudentTable.TABLE_NAME, null, values);
    }



    //teacher
    public void addTeacher(Teacher teacher){
        ContentValues values = getTeacherValues(teacher);
        mDatabase.insert(Schema.TeacherTable.TABLE_NAME, null, values);
    }



    //courses
    public void addCourses(Courses courses){
        ContentValues values = getCourseValues(courses);
        mDatabase.insert(Schema.CourseTable.TABLE_NAME, null, values);
    }



    //competition
    public void addCompetition(Competitions competitions){
        ContentValues values = getCompetitionValues(competitions);
        mDatabase.insert(Schema.CompetitionTable.TABLE_NAME, null, values);
    }



    //office
    public void addOffice(Office office){
        ContentValues values = getOfficeValues(office);
        mDatabase.insert(Schema.OfficeTable.TABLE_NAME, null, values);
    }


    //office teacher
    public void addOfficeTeacher(OfficeTeacher officeTeacher){
        ContentValues values = getOfficeTeacherValues(officeTeacher);
        mDatabase.insert(Schema.OfficeTeacherTable.TABLE_NAME, null, values);
    }





    /**
     *Update the database (student)
     */

    public void updateStudentPseudo(Student student){
        String strPseudo  = student.getPsoeudo();
        String strPassword = student.getPassword();

        ContentValues values = getStudentValues(student);


        mDatabase.update(Schema.StudentTable.TABLE_NAME, values, Schema.StudentTable.Columns.PSEUDO +
                                                " = ?", new String[]{strPseudo});



        mDatabase.update(Schema.StudentTable.TABLE_NAME, values, Schema.StudentTable.Columns.PASSWORD +
                             " = ?", new String[]{strPassword});
    }



}
