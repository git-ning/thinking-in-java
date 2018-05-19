/**
 * 计算三维空间的点到原点/空间中任意两点之间的距离
 * @author ning
 * @date 2018/03/23
 */

class Point {
    double x, y, z;

    //构造方法
    Point(double x1, double y1, double z1) {
        x = x1;
        y = y1;
        z = z1;
    }

    public void setX(double x1) {
        x = x1;
    }

    public void setY(double y1) {
        y = y1;
    }

    public void setZ(double z1) {
        z = z1;
    }

    public double getDistance(Point p) {
        return (x - p.x) * (x - p.x) + (y - p.y)*(y - p.y) + (z - p.z)*(z - p.z);
    }
}

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(1.0, 2.0, 3.0);
        Point point1 = new Point(0.0, 0.0, 0.0);
        System.out.println(point.getDistance(point1));

        point.setX(2.0);
        System.out.println(point.getDistance(point1));
    }

}
