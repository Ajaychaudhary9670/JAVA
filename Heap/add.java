package Heap;

import java.util.*;

public class add {
    static class Heap {
        ArrayList<Integer>arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x = par;
                par = (x-1)/2;
            }


        }
        public void printHeap(){
            System.out.println(arr);
        }
      
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(5);
        h.add(2);
        h.add(7);
        h.add(1);
        h.add(22);
        h.add(3);
        h.printHeap();
        
    }
    
}
