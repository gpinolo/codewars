package na.jd.codewars.humadreadabletime;

public class HumanReadableTimeRepeat1 {
    public static String makeReadable(int i) {
        int hour = i/3600;
        int minute = (i - hour * 3600)/60;
        int second = i - hour * 3600 - minute*60;
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
