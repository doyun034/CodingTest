import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        
        long ans = A * B / gcd(A, B);
        
        System.out.println(ans);
    }
    
    public static long gcd(long A, long B){
        while(B != 0){
            long r = A % B;
            A = B;
            B = r;
        }
        return A;
    }
}