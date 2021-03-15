package sk.stuba.fei.uim.oop;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Chirp chirp");
    }

    void fly() {
        System.out.println("*flaps wings*");
    }
}
