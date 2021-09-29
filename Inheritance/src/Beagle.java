import java.util.Random;

public class Beagle extends Dog {
    private int rabbitsCaught = 0;
    Random rand = new Random();

    public Beagle(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Howl";
    }

    public void hunt() {
        rabbitsCaught += rand.nextInt(3);
    }

    public int getRabbitsCaught() {
        return rabbitsCaught;
    }
}
