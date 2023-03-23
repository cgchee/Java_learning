package _chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // array: a continuous storage for the same kind of data
        // declare 1
        //String[] coffees = new String[4];
        // declare 2
        String coffees[] = new String[4];
        coffees[0] = "Americano";
        coffees[1] = "Cafe_Mocha";
        coffees[2] = "Latte";
        coffees[3] = "Cappuccino";

        // declare 3
        String[] coffees1 = new String[] {"Americano", "Cafe_Mocha", "Latte", "Cappuccino"};

        // declare 4
        String[] coffees2 = {"Americano", "Cafe_Mocha", "Latte", "Cappuccino"};

        System.out.println(coffees[2]+", one");

        // int[]
        int[] i = {2, 3, 5, 2, 4, 6, 7, 2, 7, 12, 14, 15};
        System.out.println(i[3]);
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};

    }
}
