package access;

class Sundae {
    private Sundae() {}
    static Sundae makeASundae() {
        return new Sundae();
    }
}
public class IceCream {
    public static void main(String[] args) {
//        Sundae sundae = new Sundae();
        Sundae sundae1 = Sundae.makeASundae();
    }
}
