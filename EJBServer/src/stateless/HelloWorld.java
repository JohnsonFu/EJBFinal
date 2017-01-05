package stateless;

import javax.ejb.Remote;

/**
 * Created by stonezhang on 2016/12/27.
 */

@Remote
public interface HelloWorld {

    public String sayHello(String word);
}
