package _chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }

        // 1. 책 조회
        // 2. 책 대출
        // 3. 책 반납

        if (args.length == 1){
            switch (args[0]) {
                case "1":
                    System.out.println("책 조회");
                    break;
                case "2":
                    System.out.println("책 대출");
                    break;
                case "3":
                    System.out.println("책 반납");
                    break;
                default:
                    System.out.println("잘못 입력");
            }
        } else {
            System.out.println("사용법: 1~3 중 하나를 입력하세요");
        }
    }
}
