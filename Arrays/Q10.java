public class Q10 {
    static int minJumps(int[] arr) {
        return recurse(arr, 0, arr.length - 1);
    }

    static int recurse(int[] arr, int start, int end) {
        if (start == end)
            return 0;
        if (arr[start] == 0)
            return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = start + 1; i <= end && i <= start + arr[start]; i++) {
            int jumps = recurse(arr, i, end);
            if (jumps != Integer.MAX_VALUE
                    && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 3 };
        var step = minJumps(arr);
        System.out.println(step);
    }
}
