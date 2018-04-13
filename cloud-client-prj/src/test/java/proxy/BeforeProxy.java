package proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by fjm on 2018/4/13.
 */
public class BeforeProxy implements MethodInterceptor {

    public Object getProxy(Class cls) {
        return Enhancer.create(cls, this);
    }

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        return proxy.invokeSuper(target, args);
    }

    private void before() {
        System.out.println("Before");
    }
}