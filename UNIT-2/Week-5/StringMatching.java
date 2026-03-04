import java.util.*;

public class StringMatching {

    public static List<String> solve(String[] words) {

        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {

                if (i != j && words[j].contains(words[i])) {
                    res.add(words[i]);
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of words:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++)
            words[i] = sc.nextLine();

        System.out.println("Result: " + solve(words));
    }
}