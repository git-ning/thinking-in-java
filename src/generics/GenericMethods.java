package generics;

/**
 * @author ning
 * @create 2018-06-11 16:56
 */
public class GenericMethods {

    public <T> void f(T t) {
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
/* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
generics.GenericMethods
 */
