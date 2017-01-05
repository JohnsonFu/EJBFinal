package stateless;

import javax.ejb.Remote;

/**
 * Created by fulinhua on 2016/12/29.
 */
@Remote
public interface MyAccount {
    public int Add(int a);
    public int getResult();
    public void withdraw(int money);
}
