import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();
        
        int[][] pp = new int[100][100];
        int area = 0;
        
        for(int i = 0; i< p; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int j = x;j < x + 10; j++){
                for(int k = y; k < y + 10; k++){
                    pp[j][k] = 1;
                }
            }
        }
        
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(pp[i][j] == 1){
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}