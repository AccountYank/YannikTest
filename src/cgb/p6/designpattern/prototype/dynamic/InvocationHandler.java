package cgb.p6.designpattern.prototype.dynamic;

import java.lang.reflect.Method;

/**
 * Created by Yannik
 */
public interface InvocationHandler {
    void invoke(Object proxy, Method method) throws Exception;
}
