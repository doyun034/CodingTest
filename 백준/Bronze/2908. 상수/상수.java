import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        
        String Atemp = "";
        String Btemp = "";
        
        for(int i = 0; i < 3; i++){
            Atemp = Atemp + A.charAt(2 - i);
            Btemp = Btemp + B.charAt(2 - i);
        }
        int Acon = Integer.parseInt(Atemp);
        int Bcon = Integer.parseInt(Btemp);
        
        if(Acon > Bcon){
            System.out.println(Acon);
        } else{
            System.out.println(Bcon);
        }
        sc.close();    
    }
}