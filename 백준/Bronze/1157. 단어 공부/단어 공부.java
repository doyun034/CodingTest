import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next().toUpperCase();
        
        int[] a = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            int num = s.charAt(i) - 'A';
            a[num]++;
        }
        
        int b = 0;
        char ch = '?';
        for(int i = 0; i < a.length; i++){
            if(b < a[i]){
                b = a[i];
                ch = (char)(i+'A');
            } else if(b == a[i]){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
