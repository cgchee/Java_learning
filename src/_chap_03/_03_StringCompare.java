package _chap_03;

import javax.tools.JavaCompiler;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));//문자 내용 같으면 true 다르면 false
        System.out.println(s2.equals("python"));//대소문자 구분
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분 없이

        //문자열 비교 실험
        s1= "1234";
        s2= "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        s1 = new String( "1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false

        }
}
