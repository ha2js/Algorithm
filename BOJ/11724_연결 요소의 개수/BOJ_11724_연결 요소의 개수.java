import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[] visited;
	static LinkedList<Integer>[] list;
	static int cnt;
	
	static void dfs(int v) {
		visited[v] = true;
		
		Iterator<Integer> iter = list[v].iterator();
		while (iter.hasNext()) {
			int n = iter.next();
			
			if(!visited[n]) dfs(n);
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		list = new LinkedList[n+1];
		visited = new boolean[n+1];
		
		for (int i=0; i<=n; i++) {
			list[i] = new LinkedList<Integer>();
		}
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			list[u].add(v);
			list[v].add(u);
		}
		
		for (int i=1; i<=n; i++) {
			if (!visited[i]) {
				dfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();	
	}
}