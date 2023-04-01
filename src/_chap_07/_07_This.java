package _chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "Black one"; // want to change the name
        b1.appendModelName("(the newest version)");
        System.out.println((b1.modelName));

    }
}
