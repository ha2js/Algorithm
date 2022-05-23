import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String bfstr = bf.readLine();
		StringTokenizer st = new StringTokenizer(bfstr);
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int cnt = n;
		
		Queue<Integer> que = new LinkedList<Integer>();
		for (int i=1; i<=n; i++) que.offer(i);
		
		System.out.print("<");
		while (cnt > 0) {
			if (cnt == 1) System.out.print(que.poll());
			else {
				for (int i=0; i<k-1; i++)
					que.offer(que.poll());
				System.out.print(que.poll()+", ");
			}
			cnt--;
		}
		System.out.println(">");
		bf.close();
	}
}