import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mod = 1000000007;
		int[] dp = new int[n+1];
		
		if (n >= 2) {
			dp[0] = 0;
			dp[1] = 1;
			for (int i=2; i<=n; i++)
				dp[i] = (dp[i-1]+dp[i-2]) % mod;
			System.out.println(dp[n]%mod);
		} 
		else if (n == 1) System.out.println("1");
		else if (n == 0) System.out.println("0");
		
		sc.close();
	}
}