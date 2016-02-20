package hackatupc.ducky.utils;

import java.util.Random;

public class Utils {

    private final static Random generator = new Random();

    public static String random() {
        return Long.toString(generator.nextLong());
    }

    public static int randomInt() {
        return generator.nextInt();
    }


}
