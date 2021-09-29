public class Animal {
    protected int numLegs;

    public Animal(int numLegs) {
        this.numLegs = numLegs;
    }

    public String identity() {
        return "unknown";
    }

    public String makeSound() {
        return "unknown";
    }
}
