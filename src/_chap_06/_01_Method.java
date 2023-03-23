package _chap_06;

public class _01_Method {
    // Define a method
    public static void sayHello() {
        System.out.println("Hello, I'm method");
    }
    // Use(call) a defined method
    public static void main(String[] args) {
        // call a method
        System.out.println("before calling");
        sayHello();
        System.out.println("after calling");
    }
}
