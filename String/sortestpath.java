package String;

public class sortestpath {
    public static float sortPath(String str){
     int x= 0,y = 0;
     for(int i =0;i<str.length();i++){
        char dir = str.charAt(i);
        if(dir=='s'){
            y--;
        }
        else if(dir=='n'){
            y++;
        }
        else if(dir=='e'){
            x++;
        }
        else {
         x--;
        }
     }
     int X =x*x;
     int Y =y*y;
     return (float)Math.sqrt(X+Y);     // math ka sqrt function double me return karta hai is liye hame typecast karna pda
    }
    public static void main(String[] args) {
     String str = "newsswennewnsnenswn";
     System.out.println(sortPath(str));
    }
    
}
