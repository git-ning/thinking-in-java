package interfaces.filters;

/**
 * @author ning
 * @create 2018-06-01 9:34
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
