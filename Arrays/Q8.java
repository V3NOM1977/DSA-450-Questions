public class Q8 {
    public static long maxSubarraySum(int arr[], int n) {
        var maxSoFar = Long.MIN_VALUE;
        var maxEndHere = 0L;
        for (var i = 0; i < n; i++) {
            maxEndHere += arr[i];
            maxSoFar = Math.max(maxEndHere, maxSoFar);
            if (maxEndHere < 0)
                maxEndHere = 0;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, -2, 5 };
        System.out.println(maxSubarraySum(arr, arr.length));
    }
}
