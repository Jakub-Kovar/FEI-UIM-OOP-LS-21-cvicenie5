package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {

        for(var s : SvetoveStrany.values()) {

            try {
                checkSever(s);
            } catch (NotSeverException e) {
                e.printStackTrace();
            }
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
