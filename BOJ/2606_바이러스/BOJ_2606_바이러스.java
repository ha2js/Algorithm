import java.io.*;
import java.util.*;

public class Main {
	
	static int cnt = 0;
	static boolean[] visited;
	static LinkedList<Integer>[] list;
	
	static void addEdge (int v, int w) {
		list[v].add(w);
		list[w].add(v);
	}
	
	static void DFS(int v, boolean visited[]) {
		
		visited[v] = true;
		cnt++;
		
		Iterator<Integer> iter = list[v].listIterator();
		while (iter.hasNext()) {
			int n = iter.next();
			
			if (!visited[n])
				DFS(n,visited);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		list = new LinkedList[n+1];
		for (int i=1; i<=n; i++)
			list[i] = new LinkedList();
		
		for (int i=0; i<m; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			addEdge(v, w);
		}

		visited = new boolean[n+1];
		DFS(1,visited);
		
		System.out.println(--cnt);
		br.close();	
	}
}
