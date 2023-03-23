package _chap_03;

public class _01_String {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);
        //문자의 길이
        System.out.println(s.length()); //29

        //대소문자의 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //포함 관계
        System.out.println(s.contains("Java"));;//포함
        System.out.println(s.contains("C#"));;
        System.out.println(s.indexOf("Java"));//위치정보
        System.out.println(s.indexOf("C#"));
        System.out.println(s.indexOf("and")); //처음
        System.out.println(s.lastIndexOf("and")); //마지막
        System.out.println(s.startsWith("I like")); //이 문자열로 시작

    }
}
