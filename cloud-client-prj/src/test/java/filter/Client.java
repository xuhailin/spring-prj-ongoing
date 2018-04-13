package filter;

import proxy.GreetingImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fjm on 2018/4/13.
 */
public class Client {
    public static void main(String[] args) {
        List<Proxy> proxyList = new ArrayList<>();
        proxyList.add(new BeforeProxy());
        proxyList.add(new EndProxy());
        proxyList.add(new AfterProxy());

        ProxyManager proxyManager = new ProxyManager(GreetingImpl.class, proxyList);
        GreetingImpl greetingProxy = proxyManager.createProxy();

        greetingProxy.sayHello("Jack");
    }
}
