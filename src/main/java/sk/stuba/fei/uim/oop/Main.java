package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {

        checkSever(SvetoveStrany.fromString("SEVER"));
        checkSever(SvetoveStrany.fromString("JUH"));
        checkSever(SvetoveStrany.fromString("sever"));

    }

    static void checkSever(SvetoveStrany s) {
        if(s.jeSever) {
            System.out.println("je sever");
        } else {
            System.out.println("nie je sever");
        }
    }
}
