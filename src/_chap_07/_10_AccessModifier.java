package _chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // We learn about Encapsulation and Information hiding

        // There are 4 access modifier
        // private: only accessible in the same class
        // public: accessible from all classes
        // default: (when nothing is declared) accessible in the same package
        // protected: accessible in the same class, but in the child class accessible when it is the other class

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "Black One";
        b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "black";

        // A mistake in Sale
        b1.setPrice(-5000);
        System.out.println("Price: $" + b1.getPrice());

        // A mistake in Q&A
        System.out.println("Resolution: " + b1.resolution);

        System.out.println("--------------------------");

        // Getter and Setter are used to avoid or prevent errors related to instance variables
        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("White One");
        b2.setPrice(-5000);
        b2.setColor("White");

        System.out.println("Price: $" + b2.getPrice());
        System.out.println("Price input: $" + b2.getPrice());
        System.out.println("Resolution: " + b2.getResolution());
    }
}
