//2294 - 동전2
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] inp = new int[n];
		int[] dp = new int[k+1];
		
		for (int i=0; i<n; i++) inp[i] = sc.nextInt();
		for (int i=0; i<=k; i++) dp[i] = 100001;
		
		Arrays.sort(inp);
		for (int i=0; i<n; i++) {
			for (int j=inp[i]; j<=k; j++) {
				if (j==inp[i]) dp[j] = 1;
				else dp[j] = Math.min(dp[j],dp[j-inp[i]]+1);
			}
		}

		if (dp[k] >= 100001) System.out.println("-1");
		else System.out.println(dp[k]);
		sc.close();
	}
}