import java.util.Scanner;

interface Check { boolean test(int n); }

class NumberChecker {

    Check odd = n -> n % 2 != 0;

    Check prime = n -> {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    };

    Check palindrome = n -> 
        (n + "").equals(new StringBuilder(n + "").reverse().toString());
}

public class LambdaNumberChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberChecker obj = new NumberChecker();

        System.out.print("Enter test cases: ");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.print("Enter choice(1-Odd 2-Prime 3-Palindrome) and number: ");
            int c = sc.nextInt(), n = sc.nextInt();

            if (c == 1) System.out.println(obj.odd.test(n) ? "ODD" : "EVEN");
            if (c == 2) System.out.println(obj.prime.test(n) ? "PRIME" : "COMPOSITE");
            if (c == 3) System.out.println(obj.palindrome.test(n) ? "PALINDROME" : "NOT PALINDROME");
        }
    }
}
