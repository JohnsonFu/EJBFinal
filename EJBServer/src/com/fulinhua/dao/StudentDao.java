package com.fulinhua.dao;

import com.fulinhua.bean.Student;
import com.fulinhua.bean.StudentCourse;

import javax.ejb.Remote;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by com.fulinhua on 2016/12/28.
 */
@Remote
public interface StudentDao {
    public Student isExistStudent(long id, String password) throws SQLException;
    public boolean QuitCourse(int id);
    public List<StudentCourse> getStudentList(long sid) throws SQLException;
}
