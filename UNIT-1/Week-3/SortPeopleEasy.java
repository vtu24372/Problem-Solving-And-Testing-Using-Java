import java.util.*;

public class SortPeopleEasy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] heights = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and height: ");
            names[i] = sc.next();
            heights[i] = sc.nextInt();
        }

        // simple sorting
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (heights[i] < heights[j]) {

                    int tempH = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempH;

                    String tempN = names[i];
                    names[i] = names[j];
                    names[j] = tempN;
                }
            }
        }

        // output
        System.out.println("\nSorted by Height:");
        for (int i = 0; i < n; i++)
            System.out.println(names[i]);

        sc.close();
    }
}
