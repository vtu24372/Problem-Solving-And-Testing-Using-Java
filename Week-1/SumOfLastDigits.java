public class SumOfLastDigits{
    public static int Addlast(int a, int b){
        if(a<0){
            a=(-1)*a;
        }
         if(b<0){
            b=(-1)*b;
        }
        return (a%10)+(b%10);
    }
    public static void main(String[] args){
        int s = Addlast(123, 456);
        System.out.println("The sum of last two digits:"+s);
    }
}