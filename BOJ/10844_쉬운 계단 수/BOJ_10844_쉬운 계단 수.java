//10844 - 쉬운 계단수
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long sum = 0;
		int mod = 1000000000;
		long[][] dp = new long[n+1][11];
		
		dp[1][0] = 0;
		for (int i=1; i<10; i++) 
			dp[1][i] = 1;
		
		// i = 자릿수, j = j로 끝나는 숫자
		for (int i=2; i<=n; i++) {
			for (int j=0; j<10; j++) {
				if (j==0) dp[i][j] = dp[i-1][j+1];
				else if (j==9) dp[i][j] = dp[i-1][j-1];
				else dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1] % mod;
			}
		}
		for (int i=0; i<10; i++) sum += dp[n][i];
		System.out.println(sum%mod);
		sc.close();
	}
}