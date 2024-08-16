import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int sum = 0;
        int min = -1;
        
        for (int num = M; num <= N; num++) {
            if (min(num)) {
                sum += num;
                if (min == -1) {
                    min = num;
                }
            }
        }
        
        if (min == -1) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
 
    private static boolean min(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    } 
}