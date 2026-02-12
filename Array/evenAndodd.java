public class evenAndodd {
    public static void oddeven(int arr[]){
        int count=0;
        int count1 =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }else {
                count1++;
            }
        }
        System.out.println("number of even elements of anarray is:"+count);
         System.out.println("number of odd elements of anarray is:"+count1);
    }
    public static void main(String[] args) {
        int arr[] = {2,12,34,55,23,67,88,90,56};
        oddeven(arr);
    }
    
}
