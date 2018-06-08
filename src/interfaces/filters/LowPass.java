package interfaces.filters;

/**
 * @author ning
 * @create 2018-06-01 9:31
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
