import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		String tmp1 = sc.nextLine(); // ->
		String tmp2 = sc.nextLine(); 
		
		int max = Integer.MIN_VALUE;
		char[] arr1 = new char[tmp1.length()];
		char[] arr2 = new char[tmp2.length()];
		int[][] dp = new int[arr2.length+1][arr1.length+1];
		
		arr1 = tmp1.toCharArray();
		arr2 = tmp2.toCharArray();
		
		for (int i=1; i<=arr2.length; i++) {
			for (int j=1; j<=arr1.length; j++) {
				if (arr2[i-1] == arr1[j-1]) {
					dp[i][j] = dp[i-1][j-1] + 1;
					max = Math.max(dp[i][j], max);
				}
			}
		}
		if (max == Integer.MIN_VALUE) max = 0;
		System.out.println(max);
		
		sc.close();
	}
}