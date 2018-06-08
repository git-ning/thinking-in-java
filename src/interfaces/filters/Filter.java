package interfaces.filters;

/**
 * @author ning
 * @create 2018-06-01 9:26
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
