package EJBFactory;

import com.fulinhua.service.StudentService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Hashtable;

/**
 * Created by stonezhang on 2016/12/27.
 */
public class EJBFactory {
    public static Object getEjb(String jndiPath) {
        try {
            final Hashtable<String, Object> jndiProps = new Hashtable<String, Object>();

            jndiProps.put("jboss.naming.client.ejb.context", true);
            jndiProps.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

            final Context context = new InitialContext(jndiProps);
            return context.lookup(jndiPath);
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static StudentService getStudentServiceEJB(){

        final String appName = "";
        final String moduleName = "EJBServer_war_exploded";
        final String distinctName = "";
        final String beanName = "studentEJB";
        final String viewClassName = StudentService.class.getName();
        final String namespace = "ejb:" + appName + "/" + moduleName
                + "/" + distinctName +  beanName + "!" + viewClassName;

        System.out.println(namespace);
        StudentService studentService = (StudentService) getEjb(namespace);
        //
        return studentService;
    }
}
