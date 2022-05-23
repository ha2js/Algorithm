import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int i,n = sc.nextInt();
		boolean check = true;
		int mod = 1000000000;
		
		if (n < 0) {
			n *= -1;
			check = false;
		}
		
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		if (n==0) {
			System.out.println("0");
			System.out.println("0");
		}
		else if (n==1) {
			System.out.println("1");
			System.out.println("1");
		}
		else {
			dp[1] = dp[2] = 1;
			for (i=2; i<=n; i++) {
				dp[i] = (dp[i-1] % mod) + (dp[i-2] % mod);
				dp[i] %= mod;
			}
			if ((i-1)%2 == 0 && check == false) 
				System.out.println("-1");
			else
				System.out.println("1");
			System.out.println(dp[n] % mod);
		}
		sc.close();
	}
}