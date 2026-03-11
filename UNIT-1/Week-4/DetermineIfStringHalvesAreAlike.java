public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";  // Change input here
        
        int count = 0;
        int n = s.length();
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count++;
            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) count--;
        }
        
        System.out.println(count == 0);
    }
}