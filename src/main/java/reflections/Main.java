package reflections;

import myspring.IRobot;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class Main {
    public static void main(String[] args) {

        IRobot iRobot = (IRobot) ReflectionService.createObject(IRobot.class);
        iRobot.cleanRoom();
    }
}
