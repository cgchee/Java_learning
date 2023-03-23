package _chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
//        String[] coffees = {"Americano", "Cafe_Mocha", "Latte", "Cappuccino"};
//        for (int i = 0; i < 4; i++) {
//            System.out.println(coffees[i]+" 하나");
//        }
//        System.out.println("주세요.");
//        System.out.println("==========");

        // 배열의 길이를 이용한 순회
        String[] coffees = {"Americano", "Cafe_Mocha", "Latte", "Cappuccino"};
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요.");

        // enhanced for (for-each) loop
        for (String aa: coffees){
            System.out.println("aa = "+ aa);
        }
    }
}
