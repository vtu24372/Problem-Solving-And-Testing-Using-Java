import java.util.*;

public class CircularSubarray {

    public static int solve(int[] nums) {

        int total = 0;
        int maxSum = nums[0], curMax = 0;
        int minSum = nums[0], curMin = 0;

        for (int n : nums) {

            curMax = Math.max(n, curMax + n);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(n, curMin + n);
            minSum = Math.min(minSum, curMin);

            total += n;
        }

        if (maxSum < 0) return maxSum;
        return Math.max(maxSum, total - minSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Maximum Circular Subarray Sum: " + solve(arr));
    }
}