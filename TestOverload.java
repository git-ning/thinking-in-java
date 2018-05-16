/**
 * 方法重载
 * @author ning
 * @date 2018/03/23
 */

public class TestOverload {

    void max(int x, int y) {
        System.out.println(x > y ? x : y);
    }

    void max(double x, double y) {
        System.out.println(x > y ? x : y);
    }

    public static void main(String[] args) {
        TestOverload testOverload = new TestOverload();
        testOverload.max(1, 3);
        testOverload.max(2.0, 1.5);
    }
}
