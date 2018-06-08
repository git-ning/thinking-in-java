package holding;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author ning
 * @create 2018-06-07 9:02
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            // 自动装箱
            c.add(i);
        }

        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
/* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
 */
