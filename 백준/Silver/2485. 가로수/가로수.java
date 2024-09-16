import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int fir = sc.nextInt();
        int sec = sc.nextInt();
        
        int gcd = sec - fir;
        
        for(int i = 2; i < N; i++){
            int tree = sc.nextInt();
            int dis = tree - sec;
            
            if(gcd > dis){
                int temp = gcd;
                gcd = dis;
                dis = temp;
            }
            
            while(true){
                int temp = dis % gcd;
                if(temp == 0){
                    break;
                }
                dis = gcd;
                gcd = temp;
            }
            sec = tree;
        }
        int all = sec - fir;
        System.out.println(all / gcd - N + 1);
    }
}