package com.fulinhua.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by com.fulinhua on 2016/12/28.
 */
public class CourseList implements Serializable {
    public List<Course> getCourseList() {
        return CourseList;
    }

    public void setCourseList(List<Course> courseList) {
        CourseList = courseList;
    }

    private List<Course> CourseList;
}
