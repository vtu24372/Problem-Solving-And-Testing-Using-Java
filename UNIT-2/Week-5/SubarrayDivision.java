import java.util.*;

public class SubarrayDivision {

    public static int birthday(int[] s, int d, int m) {
        int count = 0;

        for (int i = 0; i <= s.length - m; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s[i + j];
            }
            if (sum == d) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of squares:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter chocolate values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter birth day and month:");
        int d = sc.nextInt();
        int m = sc.nextInt();

        int result = birthday(arr, d, m);
        System.out.println("Number of ways: " + result);
    }
}