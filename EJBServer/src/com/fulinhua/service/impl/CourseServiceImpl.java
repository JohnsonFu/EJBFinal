package com.fulinhua.service.impl;

import com.fulinhua.bean.Course;
import com.fulinhua.factory.DaoFactory;
import com.fulinhua.service.CourseService;

import javax.ejb.Stateless;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by com.fulinhua on 2016/12/28.
 */
@Stateless
public class CourseServiceImpl implements CourseService {
    @Override
    public ArrayList<Course> getAllCourse() throws SQLException {
        return DaoFactory.getCourseDao().getCourseList();
    }
}
