package reusing;

/**
 * @author ning
 * function: 名称屏蔽
 */

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {}

class Bart extends Homer {
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(1);
        bart.doh('x');
        bart.doh(1.0f);
        bart.doh(new Milhouse());

        Lisa lisa = new Lisa();
        lisa.doh(new Milhouse());
    }
}
/*  Output:
doh(float)
doh(char)
doh(float)
doh(Milhouse)
 */