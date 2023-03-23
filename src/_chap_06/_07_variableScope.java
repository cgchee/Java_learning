package _chap_06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class _07_variableScope {
    // 로컬 변수는 중괄호{ } 안에서만 유효함 for 구문의 index도 마찬가지임
    public static void methodA() {
    //    System.out.println(number);
    }

    public static void methodB() {
        int result = 1; // local varialbe
    }

    public static void main(String[] args) {
        int number = 3; // local variable

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i);
    }

    {
        int j= 0;
        System.out.println(j);
    }
    //System.out.println(j);
}
