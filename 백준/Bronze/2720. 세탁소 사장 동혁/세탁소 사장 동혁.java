import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int[] money = {25, 10, 5, 1};
        
        for(int i = 0; i < T; i++){
            int cent = sc.nextInt();
             int a = cent;
            
            for(int j = 0; j < money.length; j++){
                System.out.print(a / money[j] + " ");
                a = a % money[j];
            }
            System.out.println();
        }
    }
}