package reflections;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class ReflectionService {


    @SneakyThrows
    public static Object createObject(Class type) {
        Object o = type.newInstance();
        runInitMethods(o);
        return o;
    }

    @SneakyThrows
    public static void runInitMethods(Object o){
        Class<?> aClass = o.getClass();
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("init")) {
                method.setAccessible(true);
                method.invoke(o);
            }
        }
    }

    public static void printApi(Object o) {
        Class<?> clazz = o.getClass();

        Field[] fields = clazz.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);


        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName()+" ");
            Class<?>[] types = method.getParameterTypes();
            for (Class<?> type : types) {
                System.out.print(type+", ");
            }
            System.out.println();
        }
    }
}
