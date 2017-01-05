package servlet;

import com.fulinhua.bean.Student;
import com.fulinhua.service.StudentService;
import factory.EJBFactory;

/**
 * Created by fulinhua on 2017/1/5.
 */
public class test {
    public static void main(String[] args){
        StudentService studentService = EJBFactory.getStudentServiceEJB();
        // StudentService studentService = (StudentService) EJBFactory.getEjb("ejb:/EJBServer_war_exploded/StudentServiceImpl!com.fulinhua.service.StudentService");
        if (studentService != null) {
            System.out
                    .println("Obtained a remote stateless session bean studentservice for invocation");


            Student student = studentService.Login(141250001, "mangguo");
            System.out.println(student.getName());
        }
    }
}
