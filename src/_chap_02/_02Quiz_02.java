package _chap_02;

public class _02Quiz_02 {
    public static void main(String[] args) {
        final int criteria = 120;
        int input_height = 187;


        String s = (input_height >= criteria) ? "가능합니다" : "불가능합니다";
        System.out.println("키가 " + input_height + " 이므로  탑승 " +s);

    }
}
