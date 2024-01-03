import java.util.Arrays;

public class Q5 {
    public static void rearrange(int arr[], int n) {
        var start = 0;
        var end = n - 1;
        while (start < end) {
            if (arr[start] < 0 && arr[end] >= 0) {
                start++;
                end--;
            } else if (arr[start] >= 0 && arr[end] >= 0) {
                end--;
            } else if (arr[start] < 0 && arr[end] < 0) {
                start++;
            } else {
                swap(arr, start, end);
                start++;
                end++;
            }
        }
    }

    public static void swap(int[] arr, int start, int end) {
        var temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        rearrange(arr, n);
        System.out.println(Arrays.toString(arr));
    }

}
