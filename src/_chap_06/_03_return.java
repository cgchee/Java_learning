package _chap_06;

public class _03_return {
    public static String getPhoneNumber() {
        String phoneNumber = "02-222-2222";
        return phoneNumber;
    }

    public static String getAddress() {
        return "Seoul";
    }

    public static String getActivities() {
        return "Bowling";
    }

    public static void main(String[] args) {
        String A = getPhoneNumber();
        System.out.println(A);

        String B = getAddress();
        System.out.println(B);

        System.out.println(getActivities());
    }
}
