package _chap_06;

public class _05_Overloading {

    public static int getPower(int number) {
        int result = number*number;
        return result;
        // return number*number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        //return number*number;
        return getPower(number);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower("2"));
        System.out.println(getPower(3,3));
        // Method overloading: 전달값이 1) 타입이 다르거나 2) 개수가 다르면
        // 함수 이름이 같더라도 알아서 알맞는 함수 찾아가서 실행
        // 다만 반환값은 반드시 타입이 같아야함
    }
}
