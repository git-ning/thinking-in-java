package interfaces;

/**
 * @author ning
 * @create 2018-06-01 9:51
 * Multipe interface
 */

interface CanFight {
    void fight();
}

interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}

class ActionCharacter {
    public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
public class Adventure {
    public static void t(CanFight x) { x.fight();}
    public static void u(CanFly x) {x.fly();}
    public static void v(CanSwim x) {x.swim();}
    public static void w(ActionCharacter x) {x.fight();}

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);  //Treat it as a CanFight
        u(hero);
        v(hero);
        w(hero);
    }
}

