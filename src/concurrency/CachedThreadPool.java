package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ning
 * @create 2018-08-13 11:21
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            service.execute(new LiftOff());
        }
        service.shutdown();
    }
}
