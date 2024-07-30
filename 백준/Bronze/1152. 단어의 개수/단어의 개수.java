import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        S = S.trim();
        
        String[] arry = S.split(" ");
        if (S.equals("")) {
            System.out.println(0);
        } else {
            System.out.println(arry.length);
        }

        sc.close();
    }
}