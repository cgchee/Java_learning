package _chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "Black one";
        b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "black";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);
        System.out.println();
//         Instance b1 is created and its properties are defined manually.
//         But if we use a constructor, when an instanc

        BlackBox b2 = new BlackBox("White one", "UHD", 30000, "White");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
        System.out.println();

        BlackBox b3 = new BlackBox("Yellow one", "UHD", 30000, "White");
        System.out.println(b3.modelName);
        System.out.println(b3.serialNumber);
        System.out.println();


    }
}
