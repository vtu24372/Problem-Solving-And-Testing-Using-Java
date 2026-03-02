import java.util.Scanner;

public class StringHalvesAlike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;
        String vowels = "aeiouAEIOU";
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count++;
            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) count--;
        }

        if (count == 0)
            System.out.println("true");
        else
            System.out.println("false");

        sc.close();
    }
}