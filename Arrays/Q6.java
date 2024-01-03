import java.util.HashSet;
import java.util.Set;

public class Q6 {
    public static int doUnion(int a[], int n, int b[], int m) {
        Set<Integer> set = new HashSet<>();
        for (var val : a)
            set.add(val);
        for (var val : b)
            set.add(val);
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int[] brr = new int[] { 1, 2, 3 };
        System.out.println(doUnion(arr, arr.length, brr, brr.length));
    }
}
