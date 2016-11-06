package myspring;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class IRobot {

    private Speaker speaker;
    private Cleaner cleaner;

    public IRobot() {
        ObjectFactory factory = ObjectFactory.getInstance();
        speaker = factory.createObject(Speaker.class);
        cleaner = factory.createObject(Cleaner.class);
    }

    private void initSomething(){
        System.out.println("Init method");
    }

    public void cleanRoom() {
        speaker.speak("I started my work");
        cleaner.clean();
        speaker.speak("I finished my work");
    }
}







