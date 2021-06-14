import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
	
		int[] dp = new int[41];
		
		dp[0] = 0; dp[1] = 1; dp[2] = 1;
		for (int i = 3; i < 41; i++) 
			dp[i] = dp[i-1] + dp[i-2];
		
		int T = sc.nextInt();
		for (int i=0; i<T; i++) {
			int n = sc.nextInt();
			if (n == 0) // 10
				System.out.println("1 0");
			else if (n == 1) //01
				System.out.println("0 1");
			else
				System.out.println(dp[n-1]+" "+dp[n]);
		}
	}
}