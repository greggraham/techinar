public abstract class Animal {
    protected int numLegs;

    public Animal(int numLegs) {
        this.numLegs = numLegs;
    }

    public abstract String identity();

    public abstract String makeSound();
}
