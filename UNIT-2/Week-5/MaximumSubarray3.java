import java.util.*;

public class MaximumSubarray3 {

    public static int[] solve(int[] a) {

        int maxSub = a[0], cur = a[0];
        int maxSeq = 0, max = a[0];

        for (int i = 0; i < a.length; i++) {
            int x = a[i];

            if (i > 0) {
                cur = Math.max(x, cur + x);
                maxSub = Math.max(maxSub, cur);
            }

            if (x > 0) maxSeq += x;
            max = Math.max(max, x);
        }

        if (maxSeq == 0) maxSeq = max;

        return new int[]{maxSub, maxSeq};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int[] ans = solve(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}