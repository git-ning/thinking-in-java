package reusing;

class SmallBrain {}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain smallBrain = new SmallBrain();
    void f() {}
}

//  Error:(12, 23) java: 无法从最终reusing.Dinosaur进行继承
//class Further extends Dinosaur {}

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur();
        dinosaur.f();
        dinosaur.i = 40;
        dinosaur.j++;
    }
}
