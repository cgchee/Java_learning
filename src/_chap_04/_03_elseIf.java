package chap_04;

public class _03_elseIf {
    public static void main(String[] args) {
        //조건문 elseIf

        //한라봉 있으면 +1
        //또는 망고주스 있으면+1
        //또는 아이스 아메리카노
        boolean hallabongAde = false;
        boolean mangoJuice = false; //망고주스
        if (hallabongAde) {
            System.out.println("한라본 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else  {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문완료 #1");
        //else if 는 여러번 사용 가능


        hallabongAde = false;
        mangoJuice = false; //망고주스
        boolean orangeJuice = true;
        if (hallabongAde) {
            System.out.println("한라본 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        } else if (orangeJuice){
            System.out.println("오렌지 주스 +1");
        }
        else  {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문완료 #2"); //else 없이 else if 만으로도 가능

    }
}
