package com.spring.study.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author: hanyf
 * @Description: 生成代理对象的代码
 * @Date: 2019/1/2 14:33
 */
public class GPProxy {

    private static String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader,
                                          Class<?>[] interfaces,
                                          GPInvocationHandler handler) {
        try {
            //1.生成源代码
            String proxySrc = generateSrc(interfaces[0]);

            //2.将生成的源代码输出到磁盘，保存为.java文件
            String filePath = GPProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(proxySrc);
            fw.close();

            //3.编译源代码，并且生成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            //4.将class文件中的内容，动态加载到JVM中来

            //5.返回被代理后的代理对象
            Class<?> proxyClass = classLoader.findClass("$Proxy0");
            Constructor<?> c = proxyClass.getConstructor(GPInvocationHandler.class);
            f.delete();

            return c.newInstance(handler);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?> interfaces) {
        StringBuffer src = new StringBuffer();
        src.append("package com.spring.study.custom;" + ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);

        src.append("GPInvocationHandler h;" + ln);

        src.append("public $Proxy0(GPInvocationHandler h) {" + ln);
        src.append("this.h = h;" + ln);
        src.append("}" + ln);

        for (Method m : interfaces.getMethods()) {
            src.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);

            src.append("try {" + ln);
            src.append("Method m = " + interfaces.getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
            src.append("this.h.invoke(this, m, null);" + ln);
            src.append("} catch (Throwable e) {e.printStackTrace();}" + ln);
            src.append("}" + ln);
        }

        src.append("}");
        return src.toString();
    }
}