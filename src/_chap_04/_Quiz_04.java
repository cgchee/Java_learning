package _chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        String carType = "sedan"; // sedan, light
        String isDisable = "handicap";
        int hours = 10;
        final int unitFare = 4000;
        final int maxFare = 30000;
        boolean discount1 = (carType=="light")? true:false;
        boolean discount2 = (isDisable=="handicap")? true:false;

        int fare = hours*unitFare;
        if(fare > maxFare){
            fare = maxFare;
        };
        if(discount1||discount2){
            fare = fare / 2;
            System.out.println(hours+"시간 주차하여, 할인 적용 주차요금은 "+fare+"원입니다.");
        } else {
            System.out.println(hours+"시간 주차하여, 할인 미적용 주차요금은 "+fare+"원입니다.");
        }


    }
}
