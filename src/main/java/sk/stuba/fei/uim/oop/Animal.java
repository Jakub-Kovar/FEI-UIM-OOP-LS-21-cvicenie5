package sk.stuba.fei.uim.oop;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract String getSound();

    void makeSound() {
        System.out.println(this.getSound());
    };

    @Override
    public String toString() {
        return name;
    }
}
