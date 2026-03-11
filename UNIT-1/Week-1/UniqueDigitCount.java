public class UniqueDigitCount{
    static int UniqueCount(int n){
        boolean[] seen = new boolean[10];
        int count = 0;
        while(n>0){
            int d = n%10;
            if(!seen[d]){
                seen[d]=true;
                count++;
            }
            n/=10;
        }
        return count;
    }
    public static void main(String[] args){
        int u = UniqueCount(1234541);
        System.out.println("The Unique digit count is : "+u);
    }
} 