import java.util.Arrays;

public class Q9 {
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        var ans = arr[n-1] - arr[0];
        var max = Integer.MIN_VALUE;
        var min = Integer.MAX_VALUE;
        for (var i = 1; i < n; i++) {
            max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            min = Math.min(arr[i] - k, arr[0] + k);
            if (min < 0)
                continue;
            ans = Math.min(ans, max - min);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 9, 12, 16, 20 };
        System.out.println(getMinDiff(arr, arr.length, 3));
    }
}
