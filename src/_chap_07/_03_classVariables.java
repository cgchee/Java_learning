package _chap_07;

public class _03_classVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "Black one";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "White one";
        System.out.println(b2.modelName);

        //
        System.out.println("  before development  ");
        System.out.println(b1.modelName + " Auto Report Function available: " + b1.canAutoReport);
        System.out.println(b2.modelName + " Auto Report Function available: " + b2.canAutoReport);
        System.out.println("All blackbox products' auto Report Function available: " + BlackBox.canAutoReport);
        System.out.println("====================");

        // We developed the function of auto report
        BlackBox.canAutoReport = true;
        System.out.println("  after development  ");
        System.out.println(b1.modelName + " Auto Report Function available: " + b1.canAutoReport);
        System.out.println(b2.modelName + " Auto Report Function available: " + b2.canAutoReport);
        System.out.println("All blackbox products' auto Report Function available: " + BlackBox.canAutoReport);


    }
}
