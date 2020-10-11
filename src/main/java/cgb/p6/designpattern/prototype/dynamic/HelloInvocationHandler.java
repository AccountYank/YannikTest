package cgb.p6.designpattern.prototype.dynamic;

import java.lang.reflect.Method;

/**
 * Created by Yannik
 */
public class HelloInvocationHandler implements InvocationHandler {

    private Object object;

    public HelloInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public void invoke(Object proxy, Method method) throws Exception{
        System.out.println("让我们开始8 !");
        try {
            method.invoke(object, new Object[]{});
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("完成，WELL DONE !");
    }
}