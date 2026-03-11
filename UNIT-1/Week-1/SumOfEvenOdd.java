import java.util.*;

public class SumOfEvenOdd {

    
    public static int getSumOfEvenOddDigits(int a, String b) {
        int sum = 0;
        while (a > 0) {
            int d = a % 10;
            if ("Even".equalsIgnoreCase(b) && d % 2 == 0) sum += d;
            if ("Odd".equalsIgnoreCase(b)  && d % 2 != 0) sum += d;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        System.out.println(getSumOfEvenOddDigits(9625, "Odd"));  
    }
}
