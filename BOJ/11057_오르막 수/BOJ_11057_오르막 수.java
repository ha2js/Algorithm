import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mod = 10007;
		long[][] dp = new long[n+1][10];
		
		for (int i=0; i<10; i++) dp[1][i] = 1;
		
		for (int i=2; i<=n; i++) {
			for (int j=9; j>=0; j--) {
				if (j==9) dp[i][j] = 1;
				else if (j==0) dp[i][j] = dp[i-1][j] + dp[i][j+1];
				else dp[i][j] = (dp[i][j+1] + dp[i-1][j]) % mod;
			}
		}
		int sum = 0;
		for (int i=0; i<10; i++)
			sum += dp[n][i];
		System.out.println(sum % mod);
		sc.close();
	}
}