package _chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별(*) 사각형 만들기
        /*

       *****
       *****
       *****
       *****
       *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

        // making a left triangle
        for (int i = 0; i < 5; i++) {
            //System.out.println("i="+i);
            for (int j = 0; j < i+1; j++) {
                //System.out.print(j);
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("We made a left triangle");

        // making a right triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {  //
                if (j<4-i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("We made a right triangle");

        // making an isosceles triangle
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {  //
                if (j<2-i || j>i+2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("We made an inversely isosceles triangle");

        // making an rotated isosceles triangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j<i+3 && j<-i+7 && j>-i+1 && j>i-3) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("We made a diamond");
    }
}
