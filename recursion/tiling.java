package recursion;

public class tiling {
    public static int tiles(int n){   // n is floor size(length) and breath is given 2
        if(n==0 || n==1){
            return 1;
        }

        //choice
         int fnm1 = tiles(n-1);   // tiles are vertical placed
         int fnm2 = tiles(n-2);   // tiles are horizental placed
         int totalaways = fnm1+fnm2;  // total aways of placing of tiles
         return totalaways;

    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(tiles(n));
    }
}
