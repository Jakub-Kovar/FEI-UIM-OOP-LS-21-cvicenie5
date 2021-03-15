package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        SvetoveStrany strana = SvetoveStrany.SEVER;

        for (SvetoveStrany s : SvetoveStrany.values()) {
            if (s == SvetoveStrany.SEVER) {
                System.out.println("rovne");
            } else {
                System.out.println("nerovne");
            }
        }



    }
}
