package interfaces.interfaceprocessor;

import java.util.Arrays;

/**
 * @author ning
 * @create 2018-06-01 8:46
 */
public abstract class StringProcessor implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static String s = "If she weights the same as a duck, she's made of wood";
    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
    }
}

class Upcase extends StringProcessor {
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
/*Output:
Using Processor Upcase
IF SHE WEIGHTS THE SAME AS A DUCK, SHE'S MADE OF WOOD
Using Processor Downcase
if she weights the same as a duck, she's made of wood
Using Processor Splitter
[If, she, weights, the, same, as, a, duck,, she's, made, of, wood]
 */