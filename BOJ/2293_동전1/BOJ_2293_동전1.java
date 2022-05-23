import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] inp = new int[n];
		int[][] dp = new int [n][k+1];
		
		for (int i=0; i<n; i++) 
			inp[i] = sc.nextInt();
		
		for (int i=1; i<=k; i++)
			if (i % inp[0] == 0) 
				dp[0][i] = 1;
	
		for (int i=1; i<n; i++) {
			for (int j=1; j<=k; j++) {
				if (j-inp[i] < 0) dp[i][j] = dp[i-1][j]; 
				else if (j-inp[i] == 0) dp[i][j] = dp[i-1][j] + 1;
				else dp[i][j] = dp[i-1][j] + dp[i][j-inp[i]];
			}
		}
		System.out.println(dp[n-1][k]);
		sc.close();
	}
}