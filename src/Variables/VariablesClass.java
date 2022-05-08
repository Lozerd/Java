package Variables;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class VariablesClass {
    public VariablesClass() {
    }

    public static void main(String[] args) {
        Method[] methods = Helper.class.getDeclaredMethods();
        for (Method method : methods) {
            switch (method.getName()) {
                case "getByteLimitsArray" ->
                        System.out.printf("ByteLimits: %s\n", Arrays.toString(Helper.getByteLimitsArray()));
                case "getShortLimitsArray" ->
                        System.out.printf("ShortLimits: %s\n", Arrays.toString(Helper.getShortLimitsArray()));
                case "getIntegerLimitsArray" ->
                        System.out.printf("IntegerLimits: %s\n", Arrays.toString(Helper.getIntegerLimitsArray()));
                case "getLongLimitsArray" ->
                        System.out.printf("LongLimits: %s\n", Arrays.toString(Helper.getLongLimitsArray()));
                case "getFloatLimitsArray" ->
                        System.out.printf("FloatLimits: %s\n", Arrays.toString(Helper.getFloatLimitsArray()));
                case "getDoubleLimitsArray" ->
                        System.out.printf("DoubleLimits: %s\n", Arrays.toString(Helper.getDoubleLimitsArray()));
                case "getCharLimitsArray" ->
                        System.out.printf("CharLimits: %s\n", Arrays.toString(Helper.getCharLimitsArray()));
                case "getBooleanLimitsArray" ->
                        System.out.printf("BooleanLimits: %s\n", Arrays.toString(Helper.getBooleanLimitsArray()));
            }
        }
    }

}
