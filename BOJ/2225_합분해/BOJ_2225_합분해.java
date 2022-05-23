import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int mod = 1000000000;
		
		long[][] dp = new long[k+1][n+1];
		
		for (int i=1; i<=n; i++) dp[1][i] = 1;
		for (int i=1; i<=k; i++) dp[i][0] = 1;
		
		for (int i=1; i<=k; i++) {
			for (int j=1; j<=n; j++)
				dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % mod; 
		}
		System.out.println(dp[k][n] % mod);
		sc.close();
	}
}