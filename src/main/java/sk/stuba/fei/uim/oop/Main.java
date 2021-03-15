package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {

        for (var s : SvetoveStrany.values()) {

            try {
                checkSever(s);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        try {
            checkSever(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("koniec programu");
    }

    static void checkSever(SvetoveStrany s) throws NotSeverException, NotSeverOrJuhException {
        if (s.jeSever) {
            System.out.println("je sever");
        } else if(s == SvetoveStrany.JUH) {
            throw new NotSeverException("musi byt sever");
        } else {
            throw new NotSeverOrJuhException("nie je sever ani juh");
        }
    }
}
