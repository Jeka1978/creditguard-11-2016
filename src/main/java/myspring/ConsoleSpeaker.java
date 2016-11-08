package myspring;

/**
 * Created by Evegeny on 06/11/2016.
 */
@Benchmark
public class ConsoleSpeaker implements Speaker {
    public void speak(String message) {
        System.out.println(message);
    }
}
