public class Q2 {

    public static int findSum(int A[], int N) {
        var min = Integer.MAX_VALUE;
        var max = Integer.MIN_VALUE;
        var idx = 0;
        while (idx < N) {
            if (A[idx] < min)
                min = A[idx];
            if (A[idx] > max)
                max = A[idx];
            idx++;
        }
        return max + min;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { -2, 1, -4, 5, 3 };
        System.out.println(findSum(arr, arr.length));
    }
}
