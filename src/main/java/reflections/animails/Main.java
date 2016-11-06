package reflections.animails;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        AnimalFactory animalFactory = new AnimalFactory();
        for (int i = 0; i < 10; i++) {
            Animal animal = animalFactory.createRandomAnimal();
            animal.makeVoice();
        }
    }
}
