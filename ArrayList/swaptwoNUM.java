package ArrayList;

import java.util.ArrayList;

public class swaptwoNUM {
    public static void SwapgivenNUM(ArrayList<Integer> list,int idx,int idx1) {
        int temp = list.get(idx);
        list.set(idx, list.get(idx1));
        list.set(idx1, temp);
     System.out.println(list);

    }
    

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("list before swap");
        System.out.println(list);
        System.out.println("list after swap");
    SwapgivenNUM(list, 1, 2);

    }
}
