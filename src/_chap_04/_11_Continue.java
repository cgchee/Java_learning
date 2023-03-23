package _chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // 손님 중에 노쇼

        //for
        int max = 20; // maximum sales number
        int sold = 0; // current sales number
        int noShow = 17; // #17 customer no show
        for (int i = 1; i <=50 ; i++) {
            System.out.println(i+ "번 손님, 주문하신 치킨 나왔습니다.");

            // if no show?
            if (i==noShow){
                System.out.println(i+"번 손님, 노쇼로 다음 손님에게 기회가 넘어갑니다");
                continue;
            }
            sold++; // 판매처리
            if (sold == max){
                System.out.println("Today, it's sold out");
                break;
            }

        }
        System.out.println("영업을 종료합니다.");

        // while
        sold = 0;
        int index = 1; // # of customer;
        while (index <= 50){
            System.out.println(index+ "번 손님 주문하신 치킨 나왔습니다");
            // if no show
            if(index == noShow){
                System.out.println(index+"번 손님, 노쇼로 다음 손님에게 기회가 넘어갑니다");
                index++;
                continue;
            }

            sold++;
           if (sold==max){
               System.out.println("today, it's sold out");
               break;
           }
           index++;
        }
    }
}
