import stateless.HelloWorld;

import javax.ejb.Stateless;

/**
 * Created by stonezhang on 2016/12/27.
 */
@Stateless(name = "HelloWorldEJB")
public class HelloWorldBean implements HelloWorld {
    public HelloWorldBean() {
    }

    public String sayHello(String word) {
        return "hello, " + word;
    }
}
