package myspring;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass());
    }

    @InjectRandomName
    private String name;

    public void cleanRoom() {
        speaker.speak(name+ " started his work");
        cleaner.clean();
        speaker.speak(name+ " finished his work");
    }






    /*public IRobot() {
        ObjectFactory factory = ObjectFactory.getInstance();
        speaker = factory.createObject(Speaker.class);
        cleaner = factory.createObject(Cleaner.class);
    }*/
}







