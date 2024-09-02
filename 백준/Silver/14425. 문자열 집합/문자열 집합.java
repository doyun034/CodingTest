import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N, M;
        int count = 0;
        Set<String> arr = new HashSet<>();
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
     
        for(int i = 0; i < N; i++){
            arr.add(br.readLine());
        }
        
        for(int i = 0; i < M; i++){
            if(arr.contains(br.readLine())){
                count++;
            }
        }
        System.out.println(count);
    }
}