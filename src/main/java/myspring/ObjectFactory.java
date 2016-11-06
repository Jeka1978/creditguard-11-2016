package myspring;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }

    public <T> T createObject(Class<T> type) {

    }








}
