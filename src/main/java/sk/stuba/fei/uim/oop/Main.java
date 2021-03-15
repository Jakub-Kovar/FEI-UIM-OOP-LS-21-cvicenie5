package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {

        for (var s : SvetoveStrany.values()) {

            try {
                checkSever(s);
            } catch (NotSeverException e) {
                e.printStackTrace();
            } catch (NotSeverOrJuhException e) {
                System.err.println("vychod or zapad");
                e.printStackTrace();
            }

        }

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
