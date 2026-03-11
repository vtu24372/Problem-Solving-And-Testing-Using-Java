public class SecondWordInUppercase {

    static String secondWordUpper(String str) {
        String[] words = str.trim().split("\\s+");
        if (words.length < 2) return "LESS";
        return words[1].toUpperCase();
    }

    public static void main(String[] args) {
        String s = secondWordUpper("Hello world from Java");
        System.out.println(s);
    }
}
