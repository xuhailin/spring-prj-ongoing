package filter;

import java.lang.reflect.Method;

/**
 * Created by fjm on 2018/4/13.
 */
public class AfterProxy extends AbstractProxy {

    @Override
    public void after(Class<?> cls, Method method, Object[] params) {
        System.out.println("After");
    }
}