package com.example.pojo.user;

/**
 * Created by Crystal on 2016/12/24.
 */
public class SelectedClasses {
    private String cid;
    private String courseName;
    private String courseCredit;
    private int grade;

    public SelectedClasses(){

    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
