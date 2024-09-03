import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        HashMap<String, String> map = new HashMap<String, String>();
        
        for(int i = 0; i < N; i++){
            String name = sc.next();
            String state = sc.next();
            
            if(map.containsKey(name)){
                map.remove(name);
            } else{
                map.put(name, state);
            }
        }
        
        ArrayList<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        
        for(var li : list){
            System.out.println(li + " ");
        }
    }
}