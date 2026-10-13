package backtarking;

public class grid {
    public static int gridaway(int i,int j,int n,int m){
        if(i==n-1 || j==m-1){  //condition for last cell bole to target per hi hai
            return 1;
        }
        else if(i==n||j==n){  //boundary se bahar ja rhe ho tab
          return 0 ;  
        }
        int w1  = gridaway(i+1, j, n, m);
        int w2 = gridaway(i, j+1, n, m);
        return w1+w2;

    }
    public static void main(String[] args) {
        System.out.println(gridaway(0, 0, 3, 3));
        
    }
}
  /// time complexity bhut jada hota hai aata hai 2^(n+m)
  ///  isko hum math ke logic se bhi kar sakte hai
  ///  ((n-1)+(m-1))!/(n-1)!*(m-1)!