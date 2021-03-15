package sk.stuba.fei.uim.oop;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    @Override
    public String toString() {
        return name;
    }
}
