package reflections.animails;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class AnimalFactoryTest {
    @Test
    @Abc
    public void createRandomAnimal() throws Exception {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal randomAnimal = animalFactory.createRandomAnimal();
        Assert.assertNotNull("animal can't be null",randomAnimal);
    }

}