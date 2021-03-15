package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>(List.of(new Dog("Rex"), new Dog("Luna"), new Parrot("Polly"), new Dog("Dasenka"), new Bird("Orol")));

        animals.forEach(animal -> {
            if (animal.toString().startsWith("L")) {
                return;
            }
            System.out.println(animal.toString());
        });
    }
}
