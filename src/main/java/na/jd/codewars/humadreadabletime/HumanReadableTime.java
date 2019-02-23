package na.jd.codewars.humadreadabletime;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int hour = seconds / 3600;
        seconds = seconds - (hour * 3600);
        int minute = seconds / 60;
        seconds = seconds - (minute * 60);
        return fill(hour) + ":" + fill(minute) + ":" + fill(seconds);
    }

    private static String fill(int anInt) {
        if(anInt<10)
            return "0" + anInt;
        return ""+anInt;
    }
}
