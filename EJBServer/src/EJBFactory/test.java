package EJBFactory;

import com.fulinhua.bean.Student;
import com.fulinhua.service.StudentService;

/**
 * Created by fulinhua on 2017/1/5.
 */
public class test {
    public static void main(String[] args){

        StudentService studentService = (StudentService) EJBFactory.getStudentServiceEJB();
        // StudentService studentService = (StudentService) EJBFactory.getEjb("ejb:/EJBServer_war_exploded/StudentServiceImpl!com.fulinhua.service.StudentService");
        if (studentService != null) {
            System.out
                    .println("Obtained a remote stateless session bean studentservice for invocation");


            Student student= studentService.Login(141250000, "mangguo");
            System.out.println(student.getName());
        }

    }
}
