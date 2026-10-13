package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class operatin {
    public static void max(ArrayList <Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max=list.get(i);
            // }
            max= Math.max(max,list.get(i));
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(25);
        list.add(27);
        list.add(1);
        list.add(22);
    //     System.out.println(list);
    //     list.remove(3);
    //     System.out.println(list);
    //     System.out.println(list.get(2)); 
    //    Collections.sort(list);
    //    System.out.println(list);
       max(list);
    }
}
