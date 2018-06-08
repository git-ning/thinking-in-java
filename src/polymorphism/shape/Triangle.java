package polymorphism.shape;

/**
 * @author ning
 * @create 2018-05-31 9:00
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
