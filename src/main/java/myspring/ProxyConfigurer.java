package myspring;

/**
 * Created by Evegeny on 08/11/2016.
 */
public interface ProxyConfigurer {
    <T> T wrapWithProxy(Object t, Class<T> originalClass);
}
