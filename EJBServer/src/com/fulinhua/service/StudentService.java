package com.fulinhua.service;

import com.fulinhua.bean.Student;
import com.fulinhua.bean.StudentCourse;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by com.fulinhua on 2016/12/28.
 */
@Remote
public interface StudentService {
    public Student Login(long id, String password);
    public List<StudentCourse> getStudentCourseList(long sid);
    public boolean QuitClass(int courseid);
}
