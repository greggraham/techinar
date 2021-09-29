import java.util.ArrayList;
import java.util.Random;

public class App {
    static Random rand = new Random();

    public static void main(String[] args) throws Exception {
        Beagle barney = new Beagle("Barney");
        barney.hunt();
        if (barney.getRabbitsCaught() > 0) {
            System.out.println(barney.identity() + " is a good boy.");
        }

        ArrayList<Animal> menagerie = new ArrayList<Animal>();
        for (int i = 0; i < 20; i++) {
            Animal newAnimal;
            int choice = rand.nextInt(3);
            if (choice == 0) {
                newAnimal = new Dog("Doggie" + i);
            } else if (choice == 1) {
                newAnimal = new Beagle("Doggie" + i);
            } else {
                newAnimal = new Cat("Kittie" + i);
            }
            menagerie.add(newAnimal);
        }

        for (Animal animal : menagerie) {
            System.out.println(animal.identity() + " says " + animal.makeSound());
        }
    }
}
