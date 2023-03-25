package _chap_06;
import java.util.Scanner;
import java.util.Arrays;

public class _11_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int maxNum = 10;
        String[] topping = new String[maxNum];
        int numTopping = 0;
        for (int i = 0; i < maxNum; i++) {
            System.out.print("Enter a topping (or type quit) : ");
            String temp = sc.nextLine();
            //System.out.print(temp);
            if (temp.equals("quit")) {
                //System.out.print(temp);
                break;
            }
            topping[i] = temp;
            if (i == maxNum - 1) {
                System.out.println("No more toppings allowed");
            }
            numTopping++;
        }

        String[] finalTopping = Arrays.copyOfRange(topping, 0, 3);
        Arrays.sort(finalTopping);
        System.out.println(finalTopping.length);
        for (int j = 0; j < numTopping; j++) {
            System.out.print((j + 1) + ". ");
            System.out.println(finalTopping[j]);
        }
    }
}