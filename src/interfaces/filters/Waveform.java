package interfaces.filters;

/**
 * @author ning
 * @create 2018-06-01 9:25
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Waveform " + id;
    }
}