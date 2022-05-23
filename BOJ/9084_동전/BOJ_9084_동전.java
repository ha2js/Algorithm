import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while (T > 0) {
			int n = sc.nextInt();
			int[] inp = new int[n];
			
			for (int i=0; i<n; i++)
				inp[i] = sc.nextInt();
			
			int k = sc.nextInt();
			int[] dp = new int[k+1];
			
			for (int i=1; i<=k; i++) {
				if (i % inp[0] == 0) 
					dp[i] = 1;
			}
			
			for (int i=1; i<n; i++) {
				for (int j=inp[i]; j<=k; j++) {
					if (j-inp[i] == 0) 
						dp[j] = dp[j]+1;
					else 
						dp[j] += dp[j-inp[i]];
				}
			}
			System.out.println(dp[k]);			
			T--;
		}
		sc.close();
	}
}