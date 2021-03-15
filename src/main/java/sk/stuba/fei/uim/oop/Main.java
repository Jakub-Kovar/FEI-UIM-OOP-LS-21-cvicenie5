package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {

        checkSever(SvetoveStrany.valueOf("SEVER"));
        checkSever(SvetoveStrany.valueOf("JUH"));
        checkSever(SvetoveStrany.valueOf("sever"));

    }

    static void checkSever(SvetoveStrany s) {
        if(s == SvetoveStrany.SEVER) {
            System.out.println("je sever");
        } else {
            System.out.println("nie je sever");
        }
    }
}
