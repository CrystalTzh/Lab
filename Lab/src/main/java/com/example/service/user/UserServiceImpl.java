package com.example.service.user;

import com.example.dao.user.UserDao;
import com.example.dao.user.UserDaoImpl;
import com.example.pojo.user.SelectedClasses;

import java.io.IOException;
import java.util.List;

/**
 * Created by Crystal on 2016/12/20.
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = null;

    public UserServiceImpl(){
        userDao = new UserDaoImpl();
    }
    /**
     * 验证当前用户是否存在
     *
     * @param userId
     * @param password
     * @return
     * @throws IOException
     */
    @Override
    public boolean isValidUser(String userId, String password) throws IOException {
        System.out.println("UserServiceImpl");
        return userDao.isValidUser(userId, password);
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

        return userDao.getStudentSelectCourse(year, userId);
    }
}
