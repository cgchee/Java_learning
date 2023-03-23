package _chap_06;

public class _06_whenToUse {

    public static int getPower(int number) {
        return getPower(number, 2);
        // 매소드 내에 매소드 호출
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // Why do we need methods?
        System.out.println(getPower(2));
    }
}
