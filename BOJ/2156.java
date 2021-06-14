import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] inp = new int[n];
		int[] dp = new int[n];
		
		for (int i=0; i<n; i++) inp[i] = sc.nextInt();
		
		if (n >= 1) dp[0] = inp[0];
		if (n >= 2) dp[1] = inp[0] + inp[1];
		if (n >= 3) dp[2] = Math.max(Math.max(inp[0]+inp[2], inp[1]+inp[2]),dp[1]);
		
		if (n < 3) {
			System.out.println(dp[n-1]);
			return;
		}
		for (int i=3; i<n; i++) dp[i] = Math.max(Math.max(dp[i-3]+inp[i-1]+inp[i], dp[i-2]+inp[i]),dp[i-1]);
		
		System.out.println(dp[n-1]);
	}
}