package com.example.administrator.mycollegeguide.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.administrator.mycollegeguide.model.Student;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/16 0016.
 */


/**
 * represent the schema for the database
 */
public  class Schema implements Serializable{



    //student table
    public static final class StudentTable{

        public static final String TABLE_NAME = "student";

        //columns
        public static final class Columns{

            public static final String PSEUDO = "pseudo";
            public static final String STUDENT_ID = "student_id";
            public static final String SURNAME = "surname";
            public static final String GIVEN_NAME = "given_name";
            public static final String GRADE = "grade";
            public static final String MAJOR = "major";
            public static final String DEPARTMENT = "department";
            public static final String DEGREE = "degree";
            public static final String EMAIL = "email";
            public static final String PASSWORD = "password";
            public static final String SECURITY_QUESTION = "security_question";
            public static final String SECURITY_ANSWER = "security_answer";

        }
    }




    //teacher table
    public static final class TeacherTable{

        public static final String TABLE_NAME = "teacher";

        public static final class Columns{

            public static final String TEACHER_ID = "teacher_id";
            public static final String NAME = "name";
            public static final String OFFICE = "office";
            public static final String EMAIL = "email";
            public static final String PHONE = "phone";
        }
    }






    //course table
    public static final class CourseTable{

        public static final String TABLE_NAME = "course";


        public static final class Columns{

            public static final String ID = "id";
            public static final String NAME = "name";
            public static final String SEMESTER = "semester";
        }
    }






    //competition table
    public static final class CompetitionTable{

        public static final String TABLE_NAME = "competition";

        public static final class Columns{

            public static final String ID = "id";
            public static final String NAME = "name";
            public static final String REQUIREMENT = "requirement";
        }

    }





    //office table
    public static final class OfficeTable{

        public static final String TABLE_NAME = "offices";

        public static final class Columns{

            public static final String OFFICE_NUMBER = "office_number";
            public static final String OFFICE_ROLE = "role";
            public static final String COLLEGE = "college";
        }
    }





    //office teacher table
    public static final class OfficeTeacherTable{

        public static final String TABLE_NAME = "office_teacher";

        public static final class Columns{

            public static final String ID = "id";
            public static final String NAME = "name";
            public static final String OFFICE_NUMBER = "office_number";
        }
    }
}

