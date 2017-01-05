package stateless;

import factory.EJBFactory;

/**
 * Created by fulinhua on 2017/1/5.
 */
public class TestHelloWorld {
    public static void main(String[] args){
            final String appName = "";
            final String moduleName = "EJBServer_war_exploded";
            final String distinctName = "";
            final String beanName = "HelloWorldEJB";
            final String viewClassName = HelloWorld.class.getName();
            final String namespace = "ejb:" + appName + "/" + moduleName
                    + "/" + distinctName + beanName + "!" + viewClassName;

            System.out.println(namespace);

            HelloWorld helloWorld = (HelloWorld) EJBFactory.getEjb(namespace);

            if (helloWorld != null) {
                System.out
                        .println("Obtained a remote stateless session bean helloBean for invocation");
                System.out.println(helloWorld.sayHello("Mary2"));
            }
        }

    }

