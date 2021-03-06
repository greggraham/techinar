public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public String identity() {
        return name;
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}
