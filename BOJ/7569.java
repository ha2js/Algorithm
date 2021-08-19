// 7569 - 토마토
import java.io.*;
import java.util.*;

class Tomato {
	int z;
	int x;
	int y;
	
	Tomato(int z, int x, int y) {
		this.z = z;
		this.x = x;
		this.y = y;
	}
}

public class Main {
	
	static int[][][] map;
	static int h,n,m,cnt;
	static int[] checkX = {0,1,0,-1,0,0};
	static int[] checkY = {-1,0,1,0,0,0};
	static int[] checkZ = {0,0,0,0,1,-1};
	
	static LinkedList<Tomato> queue = new LinkedList<Tomato>();
	
	public static void bfs() {
		
		while (!queue.isEmpty()) {
			Tomato tomato = queue.remove();
			
			int x = tomato.x;
			int y = tomato.y;
			int z = tomato.z;
			
			for (int i=0; i<6; i++) {
				int X = x + checkX[i];
				int Y = y + checkY[i];
				int Z = z + checkZ[i];
				
				if (X >= 0 && Y >= 0 && Z >= 0 && X < n && Y < m && Z < h) {
					if (map[Z][X][Y] == 0) {
						queue.add(new Tomato(Z,X,Y));
						map[Z][X][Y] = map[z][x][y] + 1;
						//cnt = map[Z][X][Y];
					}
				}
			}
		}
		int result = Integer.MIN_VALUE;
		for (int k=0; k<h; k++) {
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					if (map[k][i][j] == 0) {
						System.out.println("-1");
						return;
					}
					result = Math.max(result, map[k][i][j]);
				}
			}
		}
		 if (result > 0) result--; 
		 System.out.println(result);
		 
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		map = new int[h][n][m];
		
		for (int k=0; k<h; k++) {
			for (int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j=0; j<m; j++) {
					map[k][i][j] = Integer.parseInt(st.nextToken());
					
					if (map[k][i][j] == 1)
						queue.add(new Tomato(k,i,j));
				}
			}
		}
		bfs();
		
		br.close();	
	}
}