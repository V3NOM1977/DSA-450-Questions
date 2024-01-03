import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6};
        var start = 0;
        var end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int start, int end) {
        var temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}