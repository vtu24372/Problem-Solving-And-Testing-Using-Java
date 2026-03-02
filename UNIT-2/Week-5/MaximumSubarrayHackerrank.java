import java.util.*;

public class MaximumSubarrayHackerrank {

    public static int[] maxSubarray(int[] arr) {

        int maxSub = arr[0];
        int current = arr[0];

        int maxSeq = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            if (num > 0) maxSeq += num;
            maxElement = Math.max(maxElement, num);

            if (i > 0) {
                current = Math.max(num, current + num);
                maxSub = Math.max(maxSub, current);
            }
        }

        if (maxSeq == 0) maxSeq = maxElement;

        return new int[]{maxSub, maxSeq};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();

        while (t-- > 0) {

            System.out.println("Enter array size:");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int[] result = maxSubarray(arr);

            System.out.println(result[0] + " " + result[1]);
        }
    }
}