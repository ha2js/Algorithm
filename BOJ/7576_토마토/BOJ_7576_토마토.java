// 7576 - 토마토
import java.io.*;
import java.util.*;

class Tomato {
	int x;
	int y;
	
	Tomato(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {
	
	static int[][] map;
	static int n,m,cnt;
	static int[] checkX = {0,1,0,-1};
	static int[] checkY = {-1,0,1,0};
	
	static LinkedList<Tomato> queue = new LinkedList<Tomato>();
	
	public static void bfs() {
		
		int x,y;
		while (!queue.isEmpty()) {
			Tomato tomato = queue.remove();
			
			x = tomato.x;
			y = tomato.y;
			
			for (int i=0; i<4; i++) {
				int X = x + checkX[i];
				int Y = y + checkY[i];
				
				if (X >= 0 && Y >= 0 && X < n && Y < m) {
					if (map[X][Y] == 0) {
						queue.add(new Tomato(X,Y));
						map[X][Y] = map[x][y] + 1;
						cnt = map[X][Y];
					}
				}
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (map[i][j] == 0) {
					System.out.println("-1");
					return;
				}
			}
		}
		if (cnt > 0) cnt--;
		System.out.println(cnt);
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if (map[i][j] == 1)
					queue.add(new Tomato(i,j));
			}
		}
		bfs();
		
		br.close();	
	}
}