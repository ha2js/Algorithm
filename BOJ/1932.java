//1932 - 정수 삼각형
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] dp = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<=i; j++) 
				dp[i][j] = sc.nextInt();
		}

		for (int i=1; i<n; i++) {
			for (int j=0; j<=i; j++) {
				if (j-1>=0) dp[i][j] += Math.max(dp[i-1][j], dp[i-1][j-1]);
				else dp[i][j] += dp[i-1][j];
			}
		}
		int result = Integer.MIN_VALUE;
		for (int i=0; i<n; i++) {
			if (result < dp[n-1][i]) 
				result = dp[n-1][i];
		}
		System.out.println(result);
		sc.close();
	}
}