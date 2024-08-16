import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int a;
        int count = 0;
        
        for(int i = 0; i < N; i++){
            a = sc.nextInt();
            for(int j = 2; j <= a; j++){
                if(j == a){
                    count++;
                }
                if(a % j == 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}