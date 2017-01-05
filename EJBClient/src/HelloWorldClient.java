import com.fulinhua.bean.Student;
import com.fulinhua.service.StudentService;
import factory.EJBFactory;

import javax.ejb.EJB;

/**
 * Created by stonezhang on 2016/12/27.
 */
public class HelloWorldClient {
@EJB
    private static StudentService service;
    public static void main(String[] args) {

        final String appName = "";
        final String moduleName = "EJBServer_war_exploded";
        final String distinctName = "";
        final String beanName = "studentEJB";
        final String viewClassName = StudentService.class.getName();
        final String namespace = "ejb:" + appName + "/" + moduleName
                + "/" + distinctName +  beanName + "!" + viewClassName;

     //   System.out.println(namespaces;
       StudentService studentService = EJBFactory.getStudentServiceEJB();
     //   StudentService studentService = (StudentService) EJBFactory.getEjb("ejb:/EJBServer_war_exploded/studentEJB!com.fulinhua.service.StudentService");
        if (studentService != null) {
            System.out
                    .println("Obtained a remote stateless session bean studentservice for invocation");


           Student student= studentService.Login(141250000, "mangguo");
            System.out.println(student.getName());
        }

    }
}
