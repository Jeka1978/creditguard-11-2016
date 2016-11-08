package myspring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Evegeny on 08/11/2016.
 */
public class BenchmarkProxyConfigurer implements ProxyConfigurer {
    @Override
    public <T> T wrapWithProxy(Object t, Class<T> type) {
        if (type.isAnnotationPresent(Benchmark.class)) {
            return (T) Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("*********BENCHMARK started for method "+method.getName()+"  **********");
                    long start = System.nanoTime();
                    Object retVal = method.invoke(t, args);

                    long end = System.nanoTime();
                    System.out.println(end-start);
                    System.out.println("*********BENCHMARK finished for method "+method.getName()+"  **********");
                    return retVal;

                }
            });
        }
        return (T) t;
    }
}
