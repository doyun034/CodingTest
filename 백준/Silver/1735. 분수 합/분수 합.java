import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int E = A * D + B * C;
        int F = B * D;
        int gcd = 1;
        
        while(true){
            int temp = F % E;
            if(temp ==0){
                gcd = E;
                break;
            }
            F = E;
            E = temp;
        }
        E = (A * D + B * C) / gcd;
        F = B * D /gcd;
        
        System.out.println(E + " " + F);

    }
}