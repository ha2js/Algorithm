// 4963 - 섬의 개수
import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[][] visited;
	static int[][] island;
	static int w,h,cnt;
	static int[] checkX = {0,1,1,1,0,-1,-1,-1};
	static int[] checkY = {-1,-1,0,1,1,1,0,-1};
	
	static int dfs(int y, int x) {
		
		visited[y][x] = true;
		for (int i=0; i<8; i++) {
			
			int Y = y + checkY[i];
			int X = x + checkX[i];
			
			if (X >= 0 && Y >= 0 && X <= w && Y <= h) {
				if (!visited[Y][X] && island[Y][X] == 1) {
					dfs(Y,X);
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if (w == 0 && h == 0) break;
			
			island = new int[h+1][w+1];
			visited = new boolean[h+1][w+1];
			cnt = 0;
			
			for (int i=1; i<=h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j=1; j<=w; j++) {
					island[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int i=1; i<=h; i++) {
				for (int j=1; j<=w; j++) {
					if (!visited[i][j] && island[i][j] == 1) {
						cnt += dfs(i,j);
					}
				}
			}
			System.out.println(cnt);
		}
				
		br.close();	
	}
}