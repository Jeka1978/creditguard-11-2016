package myspring;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        ObjectFactory factory = ObjectFactory.getInstance();
        IRobot iRobot = factory.createObject(IRobot.class);
        iRobot.cleanRoom();

    }
}
