import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] inp = new int[n+1];
		int[] dp = new int[n+1];
		ArrayList<Integer> lis = new ArrayList<Integer>();
		
		for (int i=1; i<=n; i++)
			inp[i] = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j <= i; j++) {
				if (inp[i] > inp[j]) {
					if (max < dp[j] + 1) {
						max = dp[j] + 1;
					}
				}
			}
			dp[i] = max;
		}
		int max = Integer.MIN_VALUE;
		for (int i=1; i<=n; i++) {
			if (max < dp[i])
				max = dp[i];
		}
		System.out.println(max);
		for (int i=n; i>0; i--) {
			if (dp[i] == max) {
				lis.add(inp[i]);
				max--;
			}
		}
		for (int i=lis.size()-1; i>=0; i--)
			System.out.print(lis.get(i)+" ");
		sc.close();
	}
}