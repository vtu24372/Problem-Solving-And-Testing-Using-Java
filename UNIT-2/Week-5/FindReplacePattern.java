import java.util.*;

public class FindReplacePattern {

    public static List<String> solve(String[] words, String pattern) {

        List<String> res = new ArrayList<>();

        for (String word : words) {

            Map<Character, Character> p2w = new HashMap<>();
            Map<Character, Character> w2p = new HashMap<>();
            boolean match = true;

            for (int i = 0; i < word.length(); i++) {

                char p = pattern.charAt(i);
                char w = word.charAt(i);

                if ((p2w.containsKey(p) && p2w.get(p) != w) ||
                    (w2p.containsKey(w) && w2p.get(w) != p)) {
                    match = false;
                    break;
                }

                p2w.put(p, w);
                w2p.put(w, p);
            }

            if (match) res.add(word);
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

        System.out.println("Enter pattern:");
        String pattern = sc.nextLine();

        System.out.println(solve(words, pattern));
    }
}