import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] arr = new int[20][20];
	static boolean[][][] visited = new boolean[20][20][4];
	static boolean flag = false;
	static int[] checkX = {0,1,1,1};
	static int[] checkY = {1,0,1,-1}; 
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		for (int i=1; i<=19; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=1; j<=19; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i=1; i<=19; i++) {
			for (int j=1; j<=19; j++) {
				if (arr[i][j] != 0) {
					check(i,j);
					if (flag) return;
				}
			}
		}
		System.out.println(0);
		br.close();	
	}
	public static void check(int x, int y) {
		
		for (int i=0; i<4; i++) {
			if (!visited[x][y][i]) {
				visited[x][y][i] = true;
				
				int xx = x, yy = y, cnt = 0;
				while (true) {
					xx += checkX[i];
					yy += checkY[i];
					
					if ((xx >= 0 && xx <= 19 && yy >= 0 && yy <= 19)) {
						if (arr[xx][yy] == arr[x][y]) {
							visited[xx][yy][i] = true;
							cnt++;
							continue;
						}
					}
					break;
				}
				if (cnt == 4) {
					System.out.println(arr[x][y]);
					if (i == 3) {
						x += 4;
						y -= 4;
					}
					System.out.println(x + " " + y);
					flag = true;
					return;
				}
			}
		}
	}
}