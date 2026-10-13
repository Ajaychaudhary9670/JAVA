package Heap;
import  java.util.*;

public class first {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(18);
        pq.add(3);
        pq.add(9);     /// O(logn)
        pq.add(6);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+ " ");    ///O(n)
            pq.remove();    ///O(logn)

        }
    }
    
}
