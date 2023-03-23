package _chap_02;

public class _04_Operator {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = false;

        boolean 제육 =false;
        boolean 계란 =true;;

        System.out.println(김치찌개 || 계란 || 제육);
        System.out.println(김치찌개 && 계란 && 제육);

        System.out.println((5>3) && (3>1));
        System.out.println((5>3)&& (3<1));

        //Or 연산
        System.out.println((5 >3) || (3>1)); //5는 3
        System.out.println((5>3) || (3<1));
        System.out.println((!(5<3))|| (3<1));

        System.out.println( (1< 3) && (3 < 5));

        //논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5==5));
        System.out.println(!(5==5));
    }
}
