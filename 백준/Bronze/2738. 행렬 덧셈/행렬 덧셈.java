import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        
        for(int row = 0; row < N; row++){
            for(int column = 0; column < M; column++){
                arr[row][column] = sc.nextInt();
            }
        }
        
        for(int aRow = 0; aRow < N; aRow++){
            for(int aColumn = 0; aColumn < M; aColumn++){
                arr[aRow][aColumn] += sc.nextInt();
                System.out.print(arr[aRow][aColumn] + " ");
            }
            System.out.println();
        }
    }
}