import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int d = 2;
        
        for(int i = 0; i < N; i++){
            d += (d - 1);
        }
        System.out.println(d * d);
        
        sc.close();
    }
}