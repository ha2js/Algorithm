// 14501 - 퇴사
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int[] dp = new int[n+1];
		int[] t = new int[n+1];
		int[] p =new int[n+1];
		int max = Integer.MIN_VALUE;
		
		for (int i=1; i<=n; i++) {
			String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str);
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		if (t[n] == 1 || t[n] == 0) dp[n] = p[n];
		else dp[n] = 0;
		for (int i=n-1; i>=1; i--) {
			if (t[i] + i > n+1) 
				dp[i] = dp[i+1];
			else {
				int tmp;
				if (i+t[i] <= n) tmp = p[i]+dp[i+t[i]];
				else tmp = p[i];
				dp[i] = Math.max(dp[i+1], tmp);
			}
		}
		for (int i=1; i<=n; i++)
			if (max < dp[i])
				max = dp[i];
		
		System.out.println(max);
		bf.close();
	}
}