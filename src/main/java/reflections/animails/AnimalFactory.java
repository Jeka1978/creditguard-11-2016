package reflections.animails;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class AnimalFactory {
    private Reflections reflections = new Reflections("reflections.animails");
    private List<Class<? extends Animal>> animalClasses = new ArrayList<>();

    public AnimalFactory() {
        Set<Class<? extends Animal>> classes = reflections.getSubTypesOf(Animal.class);
        System.out.println(classes.size());
        for (Class<? extends Animal> animalClass : classes) {
            if (!Modifier.isAbstract(animalClass.getModifiers())) {
                this.animalClasses.add(animalClass);
            }
        }
     }

//     @SneakyThrows
    public Animal createRandomAnimal() throws IllegalAccessException, InstantiationException {
        Random random = new Random();
        Class<? extends Animal> animalClass = animalClasses.get(random.nextInt(animalClasses.size()));
         Animal animal = animalClass.newInstance();
         return animal;
     }
}
