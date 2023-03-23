package _chap_05;

public class _05_Quiz_05 {
    public static void main(String[] args) {

        final int smallSize = 250;
        final int largeSize = 297;

        int numSizes = ((largeSize - smallSize)/5+1);

        System.out.println("총 "+numSizes+"개의 사이즈가 있습니다.");

        // 신발 사이즈 생성하기
        int[] sizes = new int[numSizes];
        for (int i = 0; i < numSizes; i++) {
            sizes[i] = 250 + 5*i;
            System.out.println("사이즈 "+ sizes[i]+ " (재고 있음)");
        }

        // 신발 사이즈 출력하기
        for (int i = 0; i < sizes.length; i++) {
            System.out.println("사이즈 "+ sizes[i]+ " (재고 있음)");
        }
    }
}
