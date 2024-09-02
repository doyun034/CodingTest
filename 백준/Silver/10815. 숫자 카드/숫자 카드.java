import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int N, M;
        HashMap<String, Integer> O = new HashMap<>();
        
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++){
            O.put(st.nextToken(), 0);
        }
        
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < M; i++){
             if(O.get(st.nextToken()) != null){
                 sb.append("1 ");
             } else{
                 sb.append("0 ");
             }
        }
        System.out.println(sb.toString());
    }
}