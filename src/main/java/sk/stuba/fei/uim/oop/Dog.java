package sk.stuba.fei.uim.oop;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    String getSound() {
        return "Woof woof";
    }
}
