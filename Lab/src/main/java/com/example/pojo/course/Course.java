package com.example.pojo.course;

/**
 * Created by Crystal on 2016/12/24.
 */
public class Course {
    private String cid;
    private int year;
    private String courseName;
    private String courseCredit;

    public Course(){

    }

    public Course(String cid, int year, String courseName, String courseCredit) {
        this.cid = cid;
        this.year = year;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
}
