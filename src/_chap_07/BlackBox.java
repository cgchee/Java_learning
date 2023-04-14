package _chap_07;

public class BlackBox {
    String modelName;  // instance variable
    String resolution;
    int price;
    String color;
    int serialNumber;

    // modelName and resolution above are instance variables
    // Now we will use a class variable, which begins with 'static'
    // This variable is in common all over the instances
    // for generating serial number
    static int counter = 0;
    static boolean canAutoReport = false;  // if 'static' is delcared, then it is a class variable

    void autoReport(){
        if (canAutoReport) {
            System.out.println("We report automatically because we detect a collision");
        } else {
            System.out.println("We cannot report a collision");
        }
    }

    // Now we will use method and method_overload
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

    // If there's no parameter in calling a method, then the one below is executed
    // If there are parameters, then the one above is executed
    // This is an example of method_overload
    void record(){
        record(true,true,5);
    }

    // Methods above are all instance methods. (intacne_name.method_name())
    // A method with 'static' is a class method which is common to all instance.
    // intacne_name.class_method_name() is okay
    // class_name.class_method_name() is also okay

     static void callServiceCenter(){
         System.out.println("Connecting Service Center(1588-0000)");
         // modelName = "test"; impossible because modelName is instance variable
         // canAutoReport = false; // possible
     }

     // this is used when a name of variable is the same with parameter name
     // In order to tell the difference, we use this.
     void appendModelName(String modelName){
        this.modelName += modelName;
     }

    // Define a constructor. (A constructor is a kind of automatically called method when a instance is made)
    BlackBox() {
//        System.out.println("A call of the basic construction is made");
//        this.serialNumber = ++counter;
//        System.out.println("A new serial number is issued: " + this.serialNumber);
    }

    // A constructor can be overloaded.
    BlackBox(String modelName, String resolution, int price, String color){
        this();
        System.out.println("call of user-defined construction");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    // Getter & Setter
    String getModelName(){
        return modelName;
    }

    void setModelName(String modelName){
        this.modelName = modelName;
    }

    String getResolution(){
        if(resolution == null || resolution.isEmpty()){
            return "Please contact the seller";
        } else {
            return resolution;
        }
    }

    void setResolution(String resolution){
        this.resolution = resolution;
    }

    int getPrice(){
        return price;
    }

    void setPrice(int price){
        if(price < 100000){
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }
}
