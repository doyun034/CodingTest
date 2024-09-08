import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        HashSet<String> SSet = new HashSet<>();
        
        for(int i = 0; i < S.length(); i++){
            for(int j = 0; j < S.length() - i; j++){
                SSet.add(S.substring(j, j + i + 1));
            }
        }
        System.out.println(SSet.size());
    }
}