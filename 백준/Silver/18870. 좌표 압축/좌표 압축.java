import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] c_arr = new int[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = c_arr[i] = sc.nextInt();
        }
        
        Arrays.sort(c_arr);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        int i = 0;
        for(int x : c_arr){
            if(!hashMap.containsKey(x)){
                hashMap.put(x, i);
                i++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int key : arr){
            int rank = hashMap.get(key);
            sb.append(rank + " ");
        }
        System.out.println(sb);
    }
}