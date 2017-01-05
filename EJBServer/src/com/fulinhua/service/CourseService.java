package com.fulinhua.service;

import com.fulinhua.bean.Course;

import javax.ejb.Remote;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by com.fulinhua on 2016/12/28.
 */
@Remote
public interface CourseService {
    public ArrayList<Course> getAllCourse() throws SQLException;
}
