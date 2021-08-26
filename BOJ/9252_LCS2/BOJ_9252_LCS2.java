import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[1010][1010];

	
		//String tmp1 = "ABCBDAB"; String tmp2 = "BDCABD";
		
		String tmp1 = sc.nextLine();
		String tmp2 = sc.nextLine();
		
		//String tmp1 = "ACAYKP";
		//String tmp2 = "CAPCAK";
		
		int tmp1_idx = tmp1.length();
		int tmp2_idx = tmp2.length();
		char[] str1 = new char[1010];
		char[] str2 = new char[1010];
		
		str1[0] = '0';
		str2[0] = '0';
		
		for (int i=1; i<=tmp1_idx; i++) 
			str1[i] = tmp1.charAt(i-1);
		
		for (int i=1; i<=tmp2_idx; i++)
			str2[i] = tmp2.charAt(i-1);

		for (int i=1; i<=tmp1_idx; i++) {
			for (int j=1; j<=tmp2_idx; j++) {
				if (str2[j] == str1[i]) arr[i][j] = arr[i-1][j-1] + 1;
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
		   0 B D C A B D
		 0 0 0 0 0 0 0 0
		 A 0 0 0 0 1 1 1
		 B 0 1 1 1 1 2 2
		 C 0 1 1 2 2 2 2 
		 B 0 1 1 2 2 3 3
		 D 0 1 2 2 2 3 4
		 A 0 1 2 2 3 3 4
		 B 0 1 2 2 3 4 4
		 
		 BDCABD
		 ABCBDAB -> BDAB
		 */
		String str = "";
		int width = tmp2_idx;
		int height = tmp1_idx;
		while (true) {
			if (width <= 0 || height <= 0) break;
			if (arr[height][width] == arr[height][width-1])
				width--;
			else if (arr[height][width] == arr[height-1][width])
				height--;
			else {
				if (str2[width] == str1[height]) {
					str += str2[width];
					//System.out.println(str2[width]);
					width--;
					height--;
				}
			}
		}
		System.out.println(arr[tmp1_idx][tmp2_idx]);
		for (int i=str.length()-1; i>=0; i--) 
			System.out.print(str.charAt(i));
	}
}