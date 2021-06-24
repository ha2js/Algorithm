//15482 - 한글 LCS
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		String tmp1 = sc.nextLine();
		String tmp2 = sc.nextLine();
		
		char[] x = new char[tmp1.length()];
		char[] y = new char[tmp2.length()];
		int[][] dp = new int[x.length+1][y.length+1];
				
		x = tmp1.toCharArray();
		y = tmp2.toCharArray();
		
		for (int i=1; i<=x.length; i++) {
			for (int j=1; j<=y.length; j++) {
				if (x[i-1] == y[j-1]) dp[i][j] = dp[i-1][j-1]+1;
				else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
			}
		}
		System.out.println(dp[x.length][y.length]);
		sc.close();
	}
}