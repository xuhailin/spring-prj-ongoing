package filter;

import java.lang.reflect.Method;

/**
 * Created by fjm on 2018/4/13.
 */
public class EndProxy extends AbstractProxy {

    @Override
    public void end() {
        System.out.println("End");
    }
}