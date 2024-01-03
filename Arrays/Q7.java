import java.util.Arrays;

public class Q7 {
    public static void rotate(int arr[], int n) {
        var last = arr[n - 1];
        for (int idx = n - 1; idx > 0; idx--) {
            arr[idx] = arr[idx - 1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        rotate(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
