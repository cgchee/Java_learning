package chap_04;

public class _01_if {
    public static void main(String[] args) {
        //조건문 If
        int hour = 15; // 오전 10시
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        };
        System.out.println("커피 주문 안료 #1"); //문장이 2개 이상일 경우 [}써야함

        hour = 10;
        boolean morningCoffee = true;
        //if (hour < 14 && morningCoffee == false){
        if (hour < 14 && !morningCoffee){ //morningCoffee == false, true
            System.out.println("아이스 아메리카노 + 1");
        }

        System.out.println("커피 주문 완료 #2");

        hour = 10;
        morningCoffee = true;
        if( hour >=12 || morningCoffee == true) {   //if( hour >=12 || morningCoffee )
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println( "커피 주문 완료 #3");




    }
}
