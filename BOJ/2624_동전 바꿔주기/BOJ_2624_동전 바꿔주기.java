//2624 - 동전 바꿔주기
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int k = sc.nextInt();
		
		int[][]dp = new int[k+1][t+1];
		int[][] inp = new int[k+1][2];
		
		for (int i=1; i<=k; i++) {
			for (int j=0; j<2; j++)
				inp[i][j] = sc.nextInt();
		}
		Arrays.sort(inp, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0])
					return o1[1] - o2[1];
				else
					return o1[0] - o2[0]; 
			}
		});
		for (int i=0; i<=k; i++) dp[i][0] = 1;
		for (int i=1; i<=k; i++) {
			for (int j=1; j<=t; j++) {
				if (j < inp[i][0]) {
					dp[i][j] = dp[i-1][j];
					continue;
				}
				for (int n=0; n<=inp[i][1]; n++) {
					if (j-n * inp[i][0] < 0) continue;
					dp[i][j] += dp[i-1][j-n*inp[i][0]];
				}
			}
		}
		System.out.println(dp[k][t]);
		sc.close();
	}
}