import java.util.Arrays;

public class Q4 {
    public static void sort012(int a[], int n) {
        Arrays.sort(a);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 0, 2, 1, 2, 0 };
        sort012(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
