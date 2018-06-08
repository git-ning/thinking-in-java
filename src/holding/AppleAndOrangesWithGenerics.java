package holding;

import java.util.ArrayList;

/**
 * @author ning
 * @create 2018-06-07 8:10
 */
public class AppleAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        //编译错误，holding.Orange无法转换为holding.Apple
//        apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).getId());
        }

        for (Apple c : apples) {
            System.out.println(c.getId());
        }
    }
}
