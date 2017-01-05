package com.fulinhua.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by com.fulinhua on 2016/12/28.
 */
public class StudentCourseList implements Serializable {
    public List getStudentCourseList() {
        return StudentCourseList;
    }

    public void setStudentCourseList(List studentCourseList) {
        StudentCourseList = studentCourseList;
    }

    private List StudentCourseList;
}
