package Conversions;

/*
Why do I need to write all of these conversions without any particular reason? :sad:
 */

public class TypeConversion {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0 -> System.out.println((short) Byte.MAX_VALUE);
                case 1 -> System.out.println((int) Short.MAX_VALUE);
            }
        }
        double preciseNumber = (double) (float) (long) (int) (short) Byte.parseByte("127");
        System.out.println(preciseNumber);

    }
}
