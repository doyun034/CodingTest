import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        String s[] = new String[a];
        for (int i = 0; i < a; i++) {
            String str = sc.next();
            s[i] = str.substring(0, 1) + str.substring(str.length()-1, str.length());
        }
        sc.close();
        for (int i = 0; i < a; i++) {
            System.out.println(s[i]);
        }
    }
}