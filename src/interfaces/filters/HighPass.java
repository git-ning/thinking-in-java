package interfaces.filters;

/**
 * @author ning
 * @create 2018-06-01 9:34
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
