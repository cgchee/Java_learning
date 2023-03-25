package _chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "Black one";

        b1.autoReport(); // not available now
        BlackBox.canAutoReport = true;
        b1.autoReport(); // now available

        b1.insertMemoryCard(256);

        // general video: 1
        // collision event video: 2
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("The number of general video files: " + fileCount);

        fileCount = b1.getVideoFileCount(2);
        System.out.println("The number of event video files" + fileCount);


    }
}
