package concurrency;

/**
 * @author ning
 * @create 2018-08-13 11:07
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new LiftOff());
            t.start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
