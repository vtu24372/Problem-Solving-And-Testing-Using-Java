public class PrimesInSpecifiedRange {

    public static int PrimesInRange(int a, int b) {
        int count = 0, c = 0;
        int d = a;

        while (d <= b) {

            
            if (d < 2) {
                d++;
                continue;
            }

          
            for (int i = 2; i < d; i++) {          
                if (d % i == 0) {                  
                    c++;
                }
            }

            if (c == 0) {                          
                count++;
                System.out.println(d);
            }

            d++;
            c = 0;                                 
        }
        return count;
    }

    public static void main(String[] args) {
        int r = PrimesInRange(10, 20);
        System.out.println("Count = " + r);
    }
}
