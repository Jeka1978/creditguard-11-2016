package tdd;

/**
 * Created by Evegeny on 08/11/2016.
 */
public class MaamResolverImpl implements MaamResolver {
    @Override
    public double getMaam() throws InterruptedException {
        Thread.sleep(1000);
        return 0.18;
    }
}
