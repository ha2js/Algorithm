// 1260 - DFS와 BFS
import java.io.*;
import java.util.*;


public class Main {
	
	static boolean[] visited;
	static LinkedList<Integer>[] list;
	
	static void addEdge (int v, int w) {
		list[v].add(w);
		list[w].add(v);
	}
	
	static void DFS(int v, boolean visited[]) {
		
		visited[v] = true;
		System.out.print(v + " ");
		
		Iterator<Integer> iter = list[v].listIterator();
		while (iter.hasNext()) {
			int n = iter.next();
			
			if (!visited[n])
				DFS(n,visited);
		}
	}
	static void BFS(int v) {
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[v] = true;
		queue.add(v);
		
		while (queue.size() != 0) {
			v = queue.poll();
			System.out.print(v + " ");
			
			Iterator<Integer> iter = list[v].listIterator();
			while (iter.hasNext()) {
				int n = iter.next();
				
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		list = new LinkedList[N+1];
		for (int i=1; i<=N; i++)
			list[i] = new LinkedList();
		
		for (int i=0; i<M; i++) {
			tmp = br.readLine();
			st = new StringTokenizer(tmp);
			
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			addEdge(v, w);
		}
		
		for (int i=1; i<=N; i++)
			Collections.sort(list[i]);

		visited = new boolean[N + 1];
		DFS(V, visited);
		
		System.out.println();
		visited = new boolean[N + 1];
		BFS(V);
		
		br.close();
	}
}