import java.util.Scanner;

public class SmallestLargestSubstring {

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest  = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);

            if (sub.compareTo(smallest) < 0)
                smallest = sub;

            if (sub.compareTo(largest) > 0)
                largest = sub;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.next();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("\nResult:");
        System.out.println(getSmallestAndLargest(s, k));

        sc.close();
    }
}
