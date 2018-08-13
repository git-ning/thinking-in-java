package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ning
 * @create 2018-08-13 13:59
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            service.execute(new LiftOff());
        }
        service.shutdown();
    }
}
