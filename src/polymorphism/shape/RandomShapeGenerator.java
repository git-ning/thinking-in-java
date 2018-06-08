package polymorphism.shape;

import java.util.Random;

/**
 * @author ning
 * @create 2018-05-31 9:02
 * A "factory" that randomly creates shapes
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch (rand.nextInt(3)) {
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            default:
        }
        return new Shape();
    }
}
