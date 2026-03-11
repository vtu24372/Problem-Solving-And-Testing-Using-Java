import java.util.*;

public class FindDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month day year:");
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(y, m-1, d);

        String day = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
        System.out.println(day.toUpperCase());
    }
}
