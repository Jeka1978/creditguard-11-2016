package myspring;

/**
 * Created by Evegeny on 06/11/2016.
 */

public class PowerCleaner implements Cleaner {
    @InjectRandomInt(min = 3,max = 8)
    private int repeat;
    @Override
    @Benchmark
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("SSSSSsssssssssshhhhhhhhhhh");
        }
    }
}
