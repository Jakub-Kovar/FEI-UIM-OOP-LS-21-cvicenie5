package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(List.of(new Bird(), new Bird(), new Dog(), new Bird(), new Dog()));

        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Bird) {
                ((Bird) animal).repeat("Hello world");
            }
        }
    }
}
