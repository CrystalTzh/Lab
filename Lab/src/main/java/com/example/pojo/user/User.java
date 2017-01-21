package com.example.pojo.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Crystal on 2016/12/19.
 */
public class User {

    private String userId;
    private String userName;
    private String password;



    public User(){

    }
    public User(String userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate(String userId, String password)
    {
        String url = "jdbc:mysql://localhost:3306/student";
        String user= "root";
        String dbpassword = "123456";
        boolean result = false;

        try {
            String driver ="com.mysql.jdbc.Driver";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user, dbpassword);

            if(con==null){
                System.out.println("can't open DBConnection");
            }

            String sql = "select * from `user` where userId=?" +
                    " and password=?";

            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1, userId);
            pstmt.setString(2, password);
            System.out.println(sql);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                System.out.println("PASS");
                result=true;

            }
            else
            {
                System.out.println("FAIL");
                result=false;
            }
            pstmt.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;

    }
}
