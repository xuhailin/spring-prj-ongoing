package proxy;

/**
 * Created by fjm on 2018/4/13.
 */
public class GreetingImpl implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }

}