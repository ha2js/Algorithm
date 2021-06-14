import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static int find(int[]arr, int num) {
		int mid = arr.length / 2; // 3
		if (arr[mid] > num) {
			for (int i=0; i<=mid; i++) {
				if (arr[i] == num)
					return 1;
			}
		}
		else {
			for (int i=mid; i<arr.length; i++) {
				if (arr[i] == num)
					return 1;
			}
		}
		return 0;
		
	}
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		int m = sc.nextInt();
		for (int i=0; i<m; i++) {
			int num = sc.nextInt();
			System.out.println(find(arr,num));
		}
	}
}