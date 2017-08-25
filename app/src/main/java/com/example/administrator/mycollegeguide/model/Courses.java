package com.example.administrator.mycollegeguide.model;

/**
 * Created by Administrator on 2017/8/17 0017.
 */

public class Courses {

    private String courseId;
    private String courseName;
    private String courseSemester;


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseSemester() {
        return courseSemester;
    }

    public void setCourseSemester(String courseSemester) {
        this.courseSemester = courseSemester;
    }
}
