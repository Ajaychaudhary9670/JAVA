package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

import Stack.reverse;

public class sorting {
    public static void SortCollection(ArrayList <Integer> list){
        System.out.println("accending oredr sorting");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("deconding order sorting");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList <Integer>  list = new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(202);
        SortCollection(list);


    }
}
