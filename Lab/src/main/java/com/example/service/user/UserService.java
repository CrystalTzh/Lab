package com.example.service.user;

import com.example.pojo.user.SelectedClasses;

import java.io.IOException;
import java.util.List;

/**
 * Created by Crystal on 2016/12/20.
 */
public interface UserService {

    /**
     * 验证当前用户是否存在
     * @return
     * @throws IOException
     */
    public boolean isValidUser(String userId, String password) throws IOException;

    /**
     * 根据学生的学号 和 年份 返回课程列表
     * @param year
     * @param userId
     * @return
     */
    public List<SelectedClasses> getStudentSelectCourse(int year, String userId);
}
