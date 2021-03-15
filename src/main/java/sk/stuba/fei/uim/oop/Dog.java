package sk.stuba.fei.uim.oop;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof woof");
    }
}
