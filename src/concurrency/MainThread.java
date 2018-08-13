package concurrency;

/**
 * @author ning
 * @create 2018-08-13 10:47
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
