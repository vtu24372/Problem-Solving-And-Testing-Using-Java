public class SumOfPowerOfDigits{
    static int PowerOfDigits(int n){
        int temp=n;
        int sum=0;
        int digits = String.valueOf(n).length();
        while(temp>0){
            int d = temp%10;
            sum+=Math.pow(digits, d);
            temp/=10;

        }
        return sum;
    }
    public static void main(String[] args){
        int p = PowerOfDigits(20);
        System.out.println("The Sum of power :"+p);
    }
}