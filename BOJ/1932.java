// 1932 - 정수 삼각형
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] inp = new int[n][n];
		int[][] dp = new int[n][n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<=i; j++) inp[i][j] = sc.nextInt();
		}
		dp[1][0] = inp[0][0] + inp[1][0];
		dp[1][1] = inp[0][0] + inp[1][1];
		
		for (int i=2; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (j==0) dp[i][j] = dp[i-1][j] + inp[i][j];
				else dp[i][j] = Math.max(dp[i-1][j]+inp[i][j],dp[i-1][j-1]+inp[i][j]);
			}
		}
		int result = Integer.MIN_VALUE;
		for (int i=0; i<n; i++) {
			if (result < dp[n-1][i]) result = dp[n-1][i];
		}
		System.out.println(result);
		sc.close();
	}
}