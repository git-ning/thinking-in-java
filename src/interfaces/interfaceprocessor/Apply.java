package interfaces.interfaceprocessor;

/**
 * @author ning
 * @create 2018-06-01 8:44
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
