//12865 - 평범한 배낭
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] dp = new int[n+1][k+1];
		
		int[] w = new int[n+1];
		int[] v = new int[n+1];
		
		for (int i=1; i<=n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		/* 
		      1 2 3 4 5  6 7
		    1 0 0 0 0 0  13 13
		    2 0 0 0 8 8  13 13
		    3 0 0 6 8 8  13 14
		    4 0 0 6 8 12 13 14
		 */
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=k; j++) {
				dp[i][j] = dp[i-1][j];
				if (j-w[i] >= 0) dp[i][j] = Math.max(dp[i-1][j-w[i]]+v[i], dp[i][j]);
				// 무게에서 자신의 무게를 뺐을 때 남으면 
				// max(남는 무게 + 현재 무게, 이전 무게)
			}
		}
		System.out.println(dp[n][k]);
		sc.close();
	}
}