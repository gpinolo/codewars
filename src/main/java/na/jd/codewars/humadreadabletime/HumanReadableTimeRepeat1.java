package na.jd.codewars.humadreadabletime;

public class HumanReadableTimeRepeat1 {
    public static String makeReadable(int i) {
        return String.format("%02d:%02d:%02d", i/3600, i/60%60, i % 60);
    }
}
