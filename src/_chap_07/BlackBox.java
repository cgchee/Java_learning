package _chap_07;

public class BlackBox {
    String modelName;  // instance variable
    String resolution;
    int price;
    String color;
    static boolean canAutoReport = false;  // if 'static' is delcared, then it is a class variable

    void autoReport(){
        if (canAutoReport) {
            System.out.println("We report automatically because we detect a collision");
        } else {
            System.out.println("We cannot report a collision");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("A memory card was inserted");
        System.out.println("The capacity is " + capacity + " GB.");
    }

    int getVideoFileCount(int type){
        if (type == 1) { // general video
            return 9;
        } else if (type ==2) {  // collision event video
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("We start recording.");
        if(showDateTime) {
            System.out.println("Date information is displayed.");
        }
        if (showSpeed) {
            System.out.println("Speed information is displayed.");
        }
        System.out.println("This video is recorded by " + min + " min unit");
    }

    void record(){
        record(true,true,5);
    }
}
