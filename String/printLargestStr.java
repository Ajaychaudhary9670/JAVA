package String;

public class printLargestStr {
    public static void largest(String fruits[]){
        String smallest = fruits[0];
        for(int i =1;i<fruits.length;i++){
            if(smallest.compareTo(fruits[i])<0){
                smallest = fruits[i];
            }
        }
        System.out.println(smallest);
    }
    public static void main(String[] args) {
        String fruits[]= {"mango","apple", "orange","banana","xmax"};
        largest(fruits); 


        

    }
    
}
