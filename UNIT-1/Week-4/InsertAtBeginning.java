import java.util.*;

public class InsertAtBeginning{
    public static void main(String[] args){
        ArrayDeque <Integer> a = new ArrayDeque <>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        
        for(int i: a){
            System.out.print(i+" ");
        }
        System.out.println();
        a.addFirst(77);
         for(int i: a){
            System.out.print(i+" ");
        }
        
    }
}