import java.util.Arrays;

public class Q3 {

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 7, 10, 4, 3, 20, 15 };
        var k = 3;
        System.out.println(kthSmallest(arr, 0, arr.length - 1, k));
    }

}
