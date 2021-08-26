import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[1001][1001];

		/*
		 * String tmp1 = "ABCBDAB"; String tmp2 = "BDCABD";
		 */
		String tmp1 = sc.nextLine();
		String tmp2 = sc.nextLine();
		
		int tmp1_idx = tmp1.length();
		int tmp2_idx = tmp2.length();
		char[] str1 = new char[1001];
		char[] str2 = new char[1001];

		
		str1[0] = '0';
		str2[0] = '0';
		
		for (int i=1; i<=tmp1_idx; i++) 
			str1[i] = tmp1.charAt(i-1);
		
		for (int i=1; i<=tmp2_idx; i++)
			str2[i] = tmp2.charAt(i-1);
		
		for (int i=1; i<=tmp1_idx; i++) {
			for (int j=1; j<=tmp2_idx; j++) {
				if (str2[j] == str1[i])
					arr[i][j] = arr[i-1][j-1] + 1;
				else {
					if (arr[i-1][j] < arr[i][j-1])
						arr[i][j] = arr[i][j-1];
					else if (arr[i-1][j] > arr[i][j-1])
						arr[i][j] = arr[i-1][j];
					else
						arr[i][j] = arr[i-1][j];
				}
			}
		}
		/*
		for (int i=0; i<=tmp1_idx; i++) {
			for (int j=0; j<=tmp2_idx; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
		System.out.println(arr[tmp1_idx][tmp2_idx]);
	}
}