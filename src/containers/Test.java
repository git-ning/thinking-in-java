package containers;

/**
 * @author ning
 * @create 2018-08-08 8:03
 */
public abstract class Test<C> {
    String name;
    public Test(String name) {
        this.name = name;
    }

    abstract  int test(C container, TestParam tp);
}
