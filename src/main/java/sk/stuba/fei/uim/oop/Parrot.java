package sk.stuba.fei.uim.oop;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    void repeat(String sentence) {
        System.out.println("Parrot says: " + sentence);
    }
}
