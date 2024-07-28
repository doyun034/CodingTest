import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
        int N = sc.nextInt();
        String st = sc.next();
            
        int sum = 0;
        
        sc.close();
        
        for(int i = 0; i < N; i++){
            sum += st.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}