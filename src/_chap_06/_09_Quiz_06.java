package _chap_06;

public class _09_Quiz_06 {

    public static String getHiddenData(String customer, int position) {
        String returnString = "*************************";
        switch (position) {
            case 1:
                int nameLen = customer.length();
                returnString = customer.substring(0,0) + returnString.substring(1,nameLen);
                break;
            case 8:
                returnString = customer.substring(0,8) + "******";
                break;
            case 9:
                returnString = customer.substring(0,0) + "-****";
                break;
            default:
                System.out.println("잘못 입력");
        }
        return returnString;
    }

    public static void main(String[] args) {
        String name = "SEAN";
        String id = "990103-1234567";
        String phone = "010-1234-5678";

        System.out.println("name : " + getHiddenData(name, 1));
        System.out.println("social number : " + getHiddenData(id, 8));
        System.out.println("phone number : " + getHiddenData(phone, 9));
    }
}
