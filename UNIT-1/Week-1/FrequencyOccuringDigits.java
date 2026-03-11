public class FrequencyOccuringDigits{
        static int FreqeuncyDigit(int n){
            int[] freq = new int[10];
            while(n>0){
                freq[n%10]++;
                n/=10;
            }
            int max=0;
            int digit=0;
            for(int i=0; i<10; i++){
                if(freq[i]>max){
                max = freq[i];
                digit = i;
            }
        }
            return digit;
        }
        public static void main(String[] args){
            int f =FreqeuncyDigit(11234);
            System.out.println("The frequency occuring digit is :" +f);
        }
}