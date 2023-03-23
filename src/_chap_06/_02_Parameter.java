package _chap_06;

public class _02_Parameter {

    public static void power(int number) {
        int result = number*number;
        System.out.println("A squre of " + number + " is " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " to the power of " + exponent + " is " + result);
    }

    public static void main(String[] args) {
        // 전달값
        power(2);
        powerByExp(2,3);
    }
}
