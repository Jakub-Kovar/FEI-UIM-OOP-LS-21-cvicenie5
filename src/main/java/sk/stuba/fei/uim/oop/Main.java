package sk.stuba.fei.uim.oop;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        funcArg((s) -> System.out.println(s));
        funcArg((s) -> System.out.println(s.toUpperCase()));
    }

    static void funcArg(Consumer<String> metoda) {
        metoda.accept("hello world");
    }
}
