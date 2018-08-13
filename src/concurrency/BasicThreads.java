package concurrency;

/**
 * @author ning
 * @create 2018-08-13 11:07
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
