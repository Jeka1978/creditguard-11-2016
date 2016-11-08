package tdd;

import lombok.Setter;

/**
 * Created by Evegeny on 08/11/2016.
 */
@Setter
public class TaxCalculator {

    private MaamResolver maamResolver = new MaamResolverImpl();

    public double withMaam(double price) throws InterruptedException {
        double maam = maamResolver.getMaam();
        return price * maam+price;
    }
}
