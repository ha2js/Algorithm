import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[][] arr;
	static boolean[][] visited;
	static int cnt;
	static int[] checkX = {0,1,0,-1};
	static int[] checkY = {-1,0,1,0};
	
	public static void dfs(int n, int i, int j) {
		
		visited[i][j] = true;
		cnt++;
		
		for (int k=0; k<4; k++) {
			int x = j + checkX[k];
			int y = i + checkY[k];
			
			if (x >= 0 && y >= 0 && x < n && y < n) {
				if (arr[y][x] && !visited[y][x])
					dfs(n,y,x);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new boolean[n+1][n+1];
		visited = new boolean[n+1][n+1];
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i=0; i<n; i++) {
			String inp = br.readLine();
			for (int j=0; j<n; j++) {
				int tmp = inp.charAt(j)-'0';
				
				if (tmp == 1) arr[i][j] = true;
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (arr[i][j] && !visited[i][j]) {
					dfs(n,i,j);
					if (cnt != 0) {
						result.add(cnt);
						cnt = 0;
					}
				}
			}
		}
		System.out.println(result.size());
		Collections.sort(result);
		
		for (int i=0; i<result.size(); i++) 
			 System.out.println(result.get(i));
		 
		br.close();	
	}
}