import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        int B = sc.nextInt();
        
        int temp = 1;
        int res = 0;
        
        for(int i = N.length() -1; i >= 0; i--){
            char c = N.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                res += (c - 55) * temp;
            } else{
                res += (c - 48) * temp;
            }
            temp *= B;
        }
        System.out.println(res);
        
        sc.close();
    }
}