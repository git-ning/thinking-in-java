package operators;

class Tank {
    int level;
}
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level = " + t1.level + ", " + "t2.level = " + t2.level);

        //将t2的引用赋值给t1，t1原来的引用被覆盖，现在t1，t2指向同一个对象
        t1 = t2;
        System.out.println("2: t1.level = " + t1.level + ", " + "t2.level = " + t2.level);

        t1.level = 27;
        System.out.println("3: t1.level = " + t1.level + ", " + "t2.level = " + t2.level);
    }
}
/* output
1: t1.level = 9, t2.level = 47
2: t1.level = 47, t2.level = 47
3: t1.level = 27, t2.level = 27
 */
