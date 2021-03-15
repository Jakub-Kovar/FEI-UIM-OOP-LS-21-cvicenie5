package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {

        for(var s : SvetoveStrany.values()) {

            System.out.println("pred");
            try {
                System.out.println("try pred");
                checkSever(s);
                System.out.println("try po");
            } catch (NotSeverException e) {
                System.out.println("catch");
                e.printStackTrace();
                throw new IllegalStateException(e);
            } finally {
                System.out.println("finally");
            }
            System.out.println("po");

        }

    }

    static void checkSever(SvetoveStrany s) throws NotSeverException {
        if(s.jeSever) {
            System.out.println("je sever");
        } else {
            throw new NotSeverException("musi byt sever");
        }
    }
}
