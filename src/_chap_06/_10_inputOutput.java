package _chap_06;

import java.util.Scanner;

public class _10_inputOutput {
    public static void main(String[] args) {
        // 입력을 받을 스캐너(Scanner)를 만든다.
        // System.in: 시스템안으로 스캔한다.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = sc.nextLine();
        // sc.nextLine(): 한 줄을 입력받는다.

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your ID number: ");
        int id = sc.nextInt();

        System.out.println("Your name is " + name);
        System.out.println("Your address is " + address);
        System.out.println("Your ID number is " + id);
        sc.close();// 없어도 된다
    }
}
