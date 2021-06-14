import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String str = sc.nextLine();
			if (str.equals("0")) break;
			
			int cnt = 1;
			int idx = str.length();
			
			int[][] result = new int[idx+1][idx+1];
			char[] arr = new char[idx+1];
			char[] arr_reverse = new char[idx+1];
			
			arr[0] = '0';
			arr_reverse[0] = '0';
			for (int i=0; i<idx; i++) 
				arr[i+1] = str.charAt(i);
			for (int i=idx-1; i>=0; i--)
				arr_reverse[cnt++] = str.charAt(i);
			
			for (int i=1; i<=idx; i++) {
				for (int j=1; j<=idx; j++) {
					if (arr[j] == arr_reverse[i])
						result[i][j] = result[i-1][j-1] + 1;
					else
						result[i][j] = Math.max(result[i-1][j], result[i][j-1]);
				}
			}
			if ((idx - result[idx][idx]) == 0) System.out.println("yes");
			else System.out.println("no");
		}
	}
}