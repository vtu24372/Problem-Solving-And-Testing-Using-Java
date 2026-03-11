import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class SortStudentsEasy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID Name CGPA: ");
            s[i] = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
        }

        // simple bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {

                if (s[j].cgpa < s[j+1].cgpa ||
                   (s[j].cgpa == s[j+1].cgpa && s[j].name.compareTo(s[j+1].name) > 0) ||
                   (s[j].cgpa == s[j+1].cgpa && s[j].name.equals(s[j+1].name) && s[j].id > s[j+1].id)) {

                    Student temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }

        // output
        System.out.println("\nSorted Student Names:");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].name);
        }

        sc.close();
    }
}
