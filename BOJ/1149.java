import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int result = Integer.MAX_VALUE;
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		int[][] dp = new int[n][3];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<3; j++)
				arr[i][j] = sc.nextInt();
		}
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		
		for (int i=1; i<n; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
		}
		for (int i=0; i<3; i++) {
			if (result > dp[n-1][i])
				result = dp[n-1][i];
		}
		System.out.println(result);
	}
}