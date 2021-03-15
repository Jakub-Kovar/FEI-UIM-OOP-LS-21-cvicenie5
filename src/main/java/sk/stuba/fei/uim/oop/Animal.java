package sk.stuba.fei.uim.oop;

public abstract class Animal implements Comparable<Animal> {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
