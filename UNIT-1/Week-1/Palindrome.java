public class Palindrome{
    static int PalindromeOfN(int a){
        int temp = a;
        int rev=0;
        while(a>0){
            rev = rev*10+a%10;
            a/=10;
        }
    if(rev==temp){
        return 1;
    } else
        {
            return 2;      
        }

    }
    public static void main(String[] args){
        int p = PalindromeOfN(10);
        System.out.println("The palidrome of a number :"+p);
    }
}