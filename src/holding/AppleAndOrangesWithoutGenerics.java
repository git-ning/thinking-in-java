package holding;

import java.util.ArrayList;

/**
 * @author ning
 * @create 2018-06-07 7:58
 */

class Apple {
    private static long counter;
    private final long id = counter++;

    public long getId() {
        return id;
    }
}

class Orange {}

public class AppleAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            //holding.Orange cannot be cast to holding.Apple
            ((Apple)apples.get(i)).getId();
        }
    }
}
