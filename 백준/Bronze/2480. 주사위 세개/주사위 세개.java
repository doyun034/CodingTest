import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a != b && b != c && a != c) {
            int reward;
            if (a > b) {
                if (c > a) {
                    reward = c;
                } else {
                    reward = a;
                }
            } else {
                if (c > b) {
                    reward = c;
                } else {
                    reward = b;
                }
            }
            System.out.println(reward * 100);
        }else {
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            }else {
                if(a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }else {
                    System.out.println(1000 + b * 100);
                    }
                }
            }
        }
    }