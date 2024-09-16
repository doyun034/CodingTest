import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        boolean[] prime = new boolean[1000001];
        prime[0] = true;
        prime[1] = true;
        
        for(int i = 2; i <= Math.sqrt(1000000); i++){
            if(prime[i]){
                continue;
            }
            
            for(int j = i * i; j < 1000001; j += i){
                prime[j] = true;
            }
        }
        
        for(int i = 0; i < N; i++){
            int count = 0;
            int temp = sc.nextInt();
            for(int j = 2; j <= temp / 2; j++){
                if(!prime[j] && !prime[temp - j]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}