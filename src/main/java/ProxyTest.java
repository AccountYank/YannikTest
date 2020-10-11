import cgb.p6.designpattern.prototype.dynamic.HelloInvocationHandler;
import cgb.p6.designpattern.prototype.dynamic.InvocationHandler;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import static java.lang.Thread.sleep;

/**
 * Created by Yannik
 */
public class ProxyTest implements Serializable {

    private static final long serialVersionUID = 1L;

    public static Object newProxyInstance(Class<?> interfaces, InvocationHandler h) throws Exception {
        Method[] methods = interfaces.getMethods();
        StringBuilder sb = new StringBuilder(1024);

        sb.append("import java.lang.reflect.Method;\n\n");
        sb.append("public class $Dynamic implements " +  interfaces.getSimpleName() + "\n");
        sb.append("{\n");
        sb.append("\tcgb.p6.designpattern.prototype.dynamic.InvocationHandler h;\n\n");
        sb.append("\tpublic $Dynamic(cgb.p6.designpattern.prototype.dynamic.InvocationHandler h)\n");
        sb.append("\t{\n");
        sb.append("\t\tthis.h = h;\n");
        sb.append("\t}\n\n");

        for (Method m : methods)
        {
            sb.append("\tpublic " + m.getReturnType() + " " + m.getName() + "()\n");
            sb.append("\t{\n");
            sb.append("\t\ttry\n");
            sb.append("\t\t{\n");
            sb.append("\t\t\tMethod md = " + interfaces.getName() + ".class.getMethod(\"" + m.getName() + "\");\n");
            sb.append("\t\t\th.invoke(this, md);\n");
            sb.append("\t\t}\n");
            sb.append("\t\tcatch (Exception e)\n");
            sb.append("\t\t{\n");
            sb.append("\t\t\te.printStackTrace();\n");
            sb.append("\t\t}\n");
            sb.append("\t}\n");
        }
        sb.append("}");

        System.out.println("==============生成 .java=====");

        /**  生成一段java代码 **/
        String fileDir = System.getProperty("user.dir");
        String fileName = fileDir + "/src/$Dynamic.java";
        File javaFile = new File(fileName);
        Writer writer = new FileWriter(javaFile);
        writer.write(sb.toString());
        writer.close();

        System.out.println("==============生成 .class=====");

        /** 动态编译这段Java代码,生成.class文件 */
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager sam = compiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> iter = sam.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask ct = compiler.getTask(null, sam, null, null, null, iter);
        ct.call();
        sam.close();

        System.out.println("==============加载 class=====");
        System.out.println(System.getProperty("user.dir"));

        /** 将生成的.class文件载入内存，默认的ClassLoader只能载入CLASSPATH下的.class文件 **/
        URL[] urls = new URL[]{(new URL("file:/" + System.getProperty("user.dir") + "/src"))};
        System.out.println("file:/" + System.getProperty("user.dir") + "/src");
        URLClassLoader ul = new URLClassLoader(urls);
        Class<?> c = Class.forName("$Dynamic", false, ul);

        /** 利用反射将c实例化出来 */
        Constructor<?> constructor = c.getConstructor(InvocationHandler.class);
        Object obj = constructor.newInstance(h);
        return obj;
    }

    public static void main(String args[]) throws Exception {
        long start = System.currentTimeMillis();
        WellDone WellDoneImp = new WellDoneImpl();
        InvocationHandler invocationHandler = new HelloInvocationHandler(WellDoneImp);
        WellDone WellDone = (WellDone)ProxyTest.newProxyInstance(WellDone.class, invocationHandler);
        System.out.println("动态生成代理耗时：" + (System.currentTimeMillis() - start) + "ms");
        WellDone.print();
        System.out.println();
    }
}
