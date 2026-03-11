public class FibonacciOfN{
    public static int Fibonnaci(int fib){
        int a=0;
        int b=1;
        int c=0;
        int d=3;
        while(d<=fib){
            c=a+b;
            a=b;
            b=c;
            d++;
        }
        return c;

    }
    public static void main(String[] args){
        int f=Fibonnaci(5);
        System.out.println("The value of fibonnaci :"+f);
    }
}