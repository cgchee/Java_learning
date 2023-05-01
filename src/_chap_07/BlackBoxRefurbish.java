package _chap_07;

public class BlackBoxRefurbish {

    public String modelName;  // instance variable
    String resolution;
    private int price;
    protected String color;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if(resolution == null || resolution.isEmpty()){
            return "Please contact the seller";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }
    // private int getPrice() { return price; }
    // In this case, another class cannot call this method.

    public void setPrice(int price) {
        if(price < 100000){
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// Also in this file, we can make other classes. But there should be only one public class
// because the name of the class should be the same the file name.
