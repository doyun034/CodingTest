import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int C = gcd(A, B);
            
            sb.append(A * B / C).append('\n');
        }
        
        System.out.println(sb);
    }
    
	public static int gcd(int A, int B) {
 
		while (B != 0) {
			int R = A % B;
 
			A = B;
			B = R;
		}
		return A;
	}
}