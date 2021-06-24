//1695 - 팰린드롬 만들기
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int n_cnt = n;
		
		int[] inp = new int[n+1];
		int[] re_inp = new int[n+1];
		int[][] dp = new int[n+1][n+1];
		
		for (int i=1; i<=n; i++)
			inp[i] = sc.nextInt();
		
		for (int i=1; i<=n; i++,n_cnt--)
			re_inp[i] = inp[n_cnt];
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if (inp[j] == re_inp[i]) dp[i][j] = dp[i-1][j-1] + 1;
				else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
			}
		}
		
		System.out.println(n-dp[n][n]);
		sc.close();
	}
}