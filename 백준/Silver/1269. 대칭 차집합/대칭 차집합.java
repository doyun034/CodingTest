import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < A; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }
        
         st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < B; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int answer = 0;
        
        for(int num : setA){
            if(!setB.contains(num)){
                answer += 1;
            }
        }
        
        for(int num : setB){
            if(!setA.contains(num)){
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}