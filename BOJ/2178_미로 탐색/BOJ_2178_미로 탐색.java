import java.io.*;
import java.util.*;

public class Main {
	static int n,m;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {-1,0,1,0};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n+1][m+1];
		visited = new boolean[n+1][m+1];
		
		for (int i=0; i<n; i++) {
			String tmp = br.readLine();
			for (int j=0; j<m; j++) {
				map[i][j] = tmp.charAt(j) - '0';
			}
		}
		visited[0][0] = true;
		bfs(0,0);
		
		System.out.println(map[n-1][m-1]);
		br.close();	
	}
	
	public static void bfs(int x, int y) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(x);
		queue.add(y);
		
		while (!queue.isEmpty()) {
			int X = queue.poll();
			int Y = queue.poll();
			
			for (int i=0; i<4; i++) {
				int xx = X + dx[i];
				int yy = Y + dy[i];
				
				if (xx >= 0 && yy >= 0 && xx < n && yy < m) {
					if (map[xx][yy] == 1 && !visited[xx][yy]) {
						queue.add(xx);
						queue.add(yy);
						visited[xx][yy] = true;
						map[xx][yy] = map[X][Y] + 1;
					}
				}
			}
		}
	}
}