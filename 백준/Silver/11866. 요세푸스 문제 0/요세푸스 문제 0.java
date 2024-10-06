import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int N = sc.nextInt();
		int K = sc.nextInt();
        
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) {
			q.add(i);
		}		
		sb.append('<');

		while(q.size() > 1) {			
			for(int i = 0; i < K - 1; i++) {
				int val = q.poll();
				q.offer(val);
			}			
			sb.append(q.poll()).append(", ");
		}
		sb.append(q.poll()).append('>');
		System.out.println(sb);
	}
 
}