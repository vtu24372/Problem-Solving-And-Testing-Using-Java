import java.util.*;

class SortPlayersEasy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] score = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and score: ");
            name[i] = sc.next();
            score[i] = sc.nextInt();
        }

        // simple bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {

                // sort by score (descending)
                if (score[j] < score[j + 1] ||
                   (score[j] == score[j + 1] && name[j].compareTo(name[j + 1]) > 0)) {

                    // swap score
                    int tempScore = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = tempScore;

                    // swap name
                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;
                }
            }
        }

        // output
        System.out.println("\nSorted Players:");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " " + score[i]);
        }

        sc.close();
    }
}
