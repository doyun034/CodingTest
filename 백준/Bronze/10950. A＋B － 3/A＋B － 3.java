import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int arr[] = new int[a];

        for(int i = 0; i < a; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[i] = b + c;
        }
        sc.close();

        for(int d : arr){
            System.out.println(d);
        }
    }
}