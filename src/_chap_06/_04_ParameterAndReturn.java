package _chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number) {
        int result = number*number;
        return result;
        // return number*number;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int arg1 = 2;
        int retVal = getPower(arg1);
        System.out.println(arg1+ " squared is " + retVal);

        int arg2 = 2;
        int arg3 = 3;
        System.out.println(arg2 + " to the power of " + arg3+ " is " + getPowerByExp(arg2, arg3));
    }
}
