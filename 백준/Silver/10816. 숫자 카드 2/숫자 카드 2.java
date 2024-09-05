import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Map<Integer, Integer> map = new HashMap<>();
       
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < M; i++){
            int input = Integer.parseInt(st.nextToken());
            if(map.get(input) == null){
                sb.append(0).append(" ");
            } else{
                sb.append(map.get(input)).append(" ");
            }
        }
        System.out.println(sb);
    }
}