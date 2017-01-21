package com.example.dao.user;

import com.example.pojo.user.SelectedClasses;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>十二月 24, 2016</pre> 
* @version 1.0 
*/ 
public class UserDaoImplTest {
//    Connection con;

@Before
public void before() throws Exception {
//    String url = "jdbc:mysql://localhost:3306/student";
//    String user= "root";
//    String dbpassword = "123456";
//
//    String driver ="com.mysql.jdbc.Driver";
//    try {
//        Class.forName(driver);
//        con = DriverManager.getConnection(url,user, dbpassword);
//        if(con==null){
//            System.out.println("can't open DBConnection");
//        }
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: isValidUser(String userId, String password) 
* 
*/ 
@Test
public void testIsValidUser() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getStudentSelectCourse(int year, String userId) 
* 
*/ 
@Test
public void testGetStudentSelectCourse() throws Exception {
//TODO: Test goes here...
    UserDao userDao = new UserDaoImpl();
    List<SelectedClasses> courses = userDao.getStudentSelectCourse(2016, "141250125");
    for(SelectedClasses course:courses){
        System.out.println(new JSONObject(course));
    }

} 


/** 
* 
* Method: createConnection()
* 
*/ 
@Test
public void testIsConnected() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = UserDaoImpl.getClass().getMethod("createConnection");
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
