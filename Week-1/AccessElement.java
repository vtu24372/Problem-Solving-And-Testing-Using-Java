import java.util.Scanner;

class AccessElement
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }

        
        System.out.print("Enter index to access: ");
        int index = s.nextInt();

        
        if (index >= 0 && index < n)
            System.out.println("Element at index " + index + " is: " + arr[index]);
        else
            System.out.println("Invalid index");
    }
}
