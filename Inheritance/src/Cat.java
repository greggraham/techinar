public class Cat extends Animal {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public String identity() {
        return name;
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
