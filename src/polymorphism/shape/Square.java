package polymorphism.shape;

/**
 * @author ning
 * @create 2018-05-31 8:59
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}
