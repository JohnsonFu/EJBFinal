import factory.EJBFactory;
import stateless.MyAccount;

/**
 * Created by fulinhua on 2016/12/29.
 */
public class MyAccountClient {
    public static void main(String[] args) {
        final String appName = "";
        final String moduleName = "EJBServer_war_exploded";
        final String distinctName = "";
        final String beanName = "MyAccountEJB";
        final String viewClassName = MyAccount.class.getName();
        final String namespace = "ejb:" + appName + "/" + moduleName
                + "/" + distinctName +  beanName + "!" + viewClassName;

        System.out.println(namespace);

        MyAccount accountA = (MyAccount) EJBFactory.getEjb("ejb:/EJBServer_war_exploded/MyAccountEJB!stateless.MyAccount?stateless");
//accountA.Add(500);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread a=new Thread(new Runnable() {
            @Override
            public void run() {
                accountA.Add(400);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我是线程A"+accountA.getResult());

            }
        });
        MyAccount accountB=(MyAccount) EJBFactory.getEjb("ejb:/EJBServer_war_exploded/MyAccountEJB!stateless.MyAccount?stateless");

        Thread b=new Thread(new Runnable() {
           @Override
           public void run() {
               accountA.Add(900);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("我是线程B"+accountA.getResult());

           }
       });
      a.start();
        b.start();


    }
}
