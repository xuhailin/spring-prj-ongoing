package proxy;

/**
 * Created by fjm on 2018/4/13.
 */
public class Client {

    public static void main(String[] args) {
        Object greetingImplBeforeProxy = new BeforeProxy().getProxy(GreetingImpl.class);
        Object greetingImplAfterBeforeProxy = new AfterProxy().getProxy(greetingImplBeforeProxy.getClass());

        GreetingImpl greetingImpl = (GreetingImpl) greetingImplAfterBeforeProxy;

        greetingImpl.sayHello("Jack");
    }
}