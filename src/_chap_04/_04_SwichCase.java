package chap_04;

public class _04_SwichCase {
    public static void main(String[] args) {
        //Swich Case
        //1등 :전액 장학금
        //2등: 반액 장학금
        //3등: 반액 장학금
        //그 외 장학금 대상 아님
        int ranking = 1; //1등
        if (ranking ==1) {
            System.out.println("전액 장학금");
        }
        else if (ranking==2) {      //else if (ranking==2 || ranking ==3)
            System.out.println("반액 장학금");
        }
        else if (ranking==3) {
            System.out.println("반액 장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료#1");

        //Swich case 문을 이용, 명확한 케이스가 있는 경우
        ranking =1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
               break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");

        }
        System.out.println("조회 완료 #2");
        //중고 상품 등급에 따른 가격을 측정
        int price =7000;
        int grade = 2;
        switch (grade) {
            case 1:
                price += 1000; //price = price + 1000
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "득급의 제품의 가격 :" +price + "원");

        int score = 95;
        if (score >=90 )
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");

        }

    }

