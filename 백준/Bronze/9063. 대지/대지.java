import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int x_min = Integer.MAX_VALUE;
        int y_min = Integer.MAX_VALUE;
        int x_max = -10000;
        int y_max = -10000;
        
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
           x_min = Math.min(x_min, x);
           x_max = Math.max(x_max, x);
           y_min = Math.min(y_min, y);
           y_max = Math.max(y_max, y);
        }
       int x = x_max-x_min;
       int y = y_max-y_min;
        System.out.println(x * y);
    }
}