package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name= "나도코딩";
        int hour = 15;


        System.out.println(name + "님 배송이 시작 됩니다. "+ hour + "시에 방문");
        System.out.println(name + "님 배송 완료");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다" );
        System.out.println( "학점은" + grade + "입니다.");

        boolean pass = true;
        System.out.println(" 이번 시험에 합격 했을까요?" + pass );

        double d = 3.123456789;
        float f = 3.123456789F;
        System.out.println((int)d);
        System.out.println(f);


        long l = 1_000_000_000_000L;
        System.out.println(l);





    }
}
