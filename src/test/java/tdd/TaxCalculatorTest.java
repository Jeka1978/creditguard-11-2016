package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 08/11/2016.
 */
public class TaxCalculatorTest {
    @Test
    public void withMaam() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculator();
        MaamResolver mock = Mockito.mock(MaamResolver.class);
        Mockito.when(mock.getMaam()).thenReturn(0.17);
        taxCalculator.setMaamResolver(mock);
        double answer = taxCalculator.withMaam(100);
        Assert.assertEquals(117,answer,0.00000001);

    }

}