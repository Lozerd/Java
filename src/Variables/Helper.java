package Variables;

public class Helper {

    public static byte[] getByteLimitsArray() {
        return new byte[]{Byte.MIN_VALUE, Byte.MAX_VALUE};
    }

    public static short[] getShortLimitsArray() {
        return new short[]{Short.MIN_VALUE, Short.MAX_VALUE};
    }

    public static int[] getIntegerLimitsArray() {
        return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
    }

    public static long[] getLongLimitsArray() {
        return new long[]{Long.MIN_VALUE, Long.MAX_VALUE};
    }

    public static float[] getFloatLimitsArray() {
        return new float[]{Float.MIN_VALUE, Float.MAX_VALUE};
    }

    public static double[] getDoubleLimitsArray() {
        return new double[]{Double.MIN_VALUE, Double.MAX_VALUE};
    }

    public static char[] getCharLimitsArray() {
        return new char[]{Character.MIN_VALUE, Character.MAX_VALUE};
    }

    public static boolean[] getBooleanLimitsArray() {
        return new boolean[]{Boolean.FALSE, Boolean.TRUE};
    }
}
