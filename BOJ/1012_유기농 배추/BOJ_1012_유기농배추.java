// 1012 - 유기농 배추
import java.io.*;
import java.util.*;

public class Main {
	
	static int m,n,k;
	static int[] checkX = {0,1,0,-1};
	static int[] checkY = {-1,0,1,0};
	
	public static void dfs(boolean arr[][], boolean visited[][], int i, int j) {
		visited[i][j] = true;
		
		for (int k=0; k<4; k++) {
			int x = j + checkX[k];
			int y = i + checkY[k];
			
			if (x >= 0 && y >= 0 && x < m && y <n)
				if (arr[y][x] && !visited[y][x])
					dfs(arr,visited,y,x);
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while (T>0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			boolean[][] arr = new boolean[n+1][m+1];
			boolean[][] visited = new boolean[n+1][m+1];
			
			for (int i=0; i<k; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[y][x] = true;
			}
			int cnt = 0;
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					if (arr[i][j] && !visited[i][j]) {
						cnt++;
						dfs(arr,visited,i,j);
					}
				}
			}
			System.out.println(cnt);
			T--;
		}
		br.close();	
	}
}