package com.example.pojo.user;

/**
 * Created by Crystal on 2016/12/24.
 */
public class Select {

    private String cid;
    private String id;
    private int grade;

    public Select(String cid, String id, int grade) {
        this.cid = cid;
        this.id = id;
        this.grade = grade;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
