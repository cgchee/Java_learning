package _chap_07;

public class _01_class {
    public static void main(String[] args) {
        // Object-Oriented Program
        // Easy maintenance
        // High re-usability

        String[] items ={"CPU", "RAM", "Hard-disk"};
        // Auto black box
        // Model name, resolution, price, color

        // The first model
        String modelName = "BlackBox";
        String resolution = "FHD";
        int price = 200000;
        String color = "Black";

        // The second model
        String modelName2 = "WhiteBox";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "White";

        // Another model?
        BlackBox bbox = new BlackBox();
        // BlackBox is a class we defined
        // bbox is an object from the class 'BlackBox'
        // And bbox is called an instance of 'BlackBox'
        BlackBox bbox2 = new BlackBox();
    }
}
