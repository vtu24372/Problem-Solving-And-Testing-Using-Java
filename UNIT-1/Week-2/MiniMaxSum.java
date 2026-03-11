import java.util.*;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }

        System.out.println((sum - max) + " " + (sum - min));
    }
}
