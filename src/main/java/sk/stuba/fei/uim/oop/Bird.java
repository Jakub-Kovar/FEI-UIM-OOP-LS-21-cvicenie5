package sk.stuba.fei.uim.oop;

public class Bird extends Animal {

    @Override
    void makeSound() {
        System.out.println("Chirp chirp");
    }

    void repeat(String sentence) {
        System.out.println("Bird says: "+ sentence);
    }
}
