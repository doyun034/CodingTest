import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N, M;
        String[] arr = br.readLine().split(" ");
        HashMap<String, String> map = new HashMap<>();
        
        N = Integer.parseInt(arr[0]);
        M = Integer.parseInt(arr[1]);
        
        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            map.put(String.valueOf(i), str);
            map.put(str, String.valueOf(i));
        }
        
        for(int i = 0; i < M; i++){
            String key = br.readLine();
            String val = map.get(key);
            
            sb.append(val).append("\n");
        }
        System.out.println(sb.toString());
    }
}