package com.example.dao.user;

import com.example.pojo.user.SelectedClasses;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Crystal on 2016/12/20.
 */
public class UserDaoImpl implements UserDao {

    static Connection con = null;

    public UserDaoImpl(){
        System.out.println("UserDaoImpl");
    }

    /**
     * 验证当前用户是否存在
     *
     * @return
     * @throws IOException
     */
    @Override
    public boolean isValidUser(String userId, String password) throws IOException {
        String url = "jdbc:mysql://localhost:3306/student";
        String user= "root";
        String dbpassword = "123456";

        String driver ="com.mysql.jdbc.Driver";

        boolean result = false;
        System.out.println("isValidUser!");

        try {
            Class.forName(driver);
            System.out.println("~~~~~~~~~~");
            con = DriverManager.getConnection(url,user, dbpassword);

            if(con==null){
                System.out.println("can't open DBConnection");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        if(con == null){
            result = false;
            return result;
        }else{
            String sql = "select * from `user` where userId=?" +
                    " and password=?";

            try {

                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, userId);
                pstmt.setString(2, password);

                System.out.println(sql);
                ResultSet rs=pstmt.executeQuery();
                if(rs.next()) {
                    System.out.println("PASS");
                    result=true;
                } else {
                    System.out.println("FAIL");
                    result=false;
                }
                pstmt.close();
                rs.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }


        }

        return result;
    }

    /**
     * 根据学生的学号 和 年份 返回课程列表
     *
     * @param year
     * @param userId
     * @return
     */
    @Override
    public List<SelectedClasses> getStudentSelectCourse(int year, String userId) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user= "root";
        String dbpassword = "123456";

        String driver ="com.mysql.jdbc.Driver";

        List<SelectedClasses> courses = new ArrayList<>();

        try {
            Class.forName(driver);
            System.out.println("~~~~~~~~~~");
            con = DriverManager.getConnection(url,user, dbpassword);

            if(con==null){
                System.out.println("can't open DBConnection");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String sql = "SELECT course.cid, course.coursename, course.coursecredit, `select`.grade from course, `select` WHERE year =?" +
                    " and course.cid = `select`.cid " +
                    "  and `select`.userId =?";



            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, year);
            pstmt.setString(2, userId);

            System.out.println(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                SelectedClasses selectedClasses = new SelectedClasses();
                selectedClasses.setCid(rs.getString("cid"));
                selectedClasses.setCourseCredit(rs.getString("coursecredit"));
                selectedClasses.setCourseName(rs.getString("coursename"));
                selectedClasses.setGrade(rs.getInt("grade"));
                courses.add(selectedClasses);
            }

            return courses;

        } catch (Exception e) {
            e.printStackTrace();
        }


        return courses;
    }
}
