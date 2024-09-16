import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        
        for(int i = 0; i < A; i++){
            long N = sc.nextLong();
            
            for(long j = N; ; j++){
                if(isPrime(j)){
                    System.out.println(j);
                    break;
                }
            }
        }
    }
    
    private static boolean isPrime(long N){
        if(N <= 1){
            return false;
        }
        if(N <= 3){
            return true;
        }
        if(N % 2 == 0 || N % 3 == 0){
            return false;
        }
        for(long i = 5; i * i <= N; i += 6){
            if (N % i == 0 || N % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}