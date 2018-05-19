package reusing;

class Cleaner {
    private String s = "Cleaner";
    public void append(String a) {
        s += a;
    }
    public void dilute() {
        append(" dilute()");
    }
    public void apply() {
        append(" apply()");
    }
    public void scrub() {
        append(" scrub()");
    }
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleaner x = new Cleaner();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

public class Detergent extends Cleaner {
    //  change a method
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    //  Add method to interface
    public void foma() {
        append(" foma()");
    }

    //  Test new class
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foma();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleaner.main(args);
    }
}
/*  Output
Cleaner dilute() apply() Detergent.scrub() scrub() foma()
Testing base class:
Cleaner dilute() apply() scrub()
 */
