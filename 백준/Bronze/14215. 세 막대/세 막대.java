import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = 0;
        
        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a < c){
            temp = a;
            a = c;
            c = temp;
        }
        
        while(true){
            int sum = a + b + c;
            if(b + c > a){
                System.out.println(sum);
                break;
            } else{
                a--;
            }
        }
    }
}