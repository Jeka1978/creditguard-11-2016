package myspring;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void cleanRoom() {
        speaker.speak("I started my work");
        cleaner.clean();
        speaker.speak("I finished my work");
    }






    /*public IRobot() {
        ObjectFactory factory = ObjectFactory.getInstance();
        speaker = factory.createObject(Speaker.class);
        cleaner = factory.createObject(Cleaner.class);
    }*/
}







