package _chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "Black One";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "black";

        // A mistake in Sale
        b1.price = -5000;
        System.out.println("Price: $" + b1.price);

        // A mistake in Q&A
        System.out.println("Resolution: " + b1.resolution);

        System.out.println("--------------------------");

        // Getter and Setter are used to avoid or prevent errors related to instance variables
        BlackBox b2 = new BlackBox();
        b2.setModelName("White One");
        b2.setPrice(-5000);
        b2.setColor("White");

        System.out.println("Price: $" + b2.getPrice());
        System.out.println("Price input: $" + b2.price);
        System.out.println("Resolution: " + b2.getResolution());
    }
}
