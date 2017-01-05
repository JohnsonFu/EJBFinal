package com.fulinhua.service.impl;

import com.fulinhua.bean.Student;
import com.fulinhua.bean.StudentCourse;
import com.fulinhua.dao.StudentDao;
import com.fulinhua.service.StudentService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by com.fulinhua on 2016/12/28.
 */
@Stateless(name = "studentEJB")
public class StudentServiceImpl implements StudentService {

    @EJB
    private StudentDao studentdao;
    @Override
    public Student Login(long id, String password) {
        try {
            return studentdao.isExistStudent(id,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<StudentCourse> getStudentCourseList(long sid) {
        try {
            return studentdao.getStudentList(sid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean QuitClass(int courseid) {
        return studentdao.QuitCourse(courseid);
    }
}
