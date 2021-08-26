import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n+1];
		// 5 3
		// 5 4 3 2 1
		for (int i=1; i<=n; i++) {
			int tmp = sc.nextInt();
			arr[i] = tmp + arr[i-1];
		}
		
		while (m > 0) {
			int front = sc.nextInt();
			int back = sc.nextInt();
			System.out.println(arr[back]-arr[front-1]);
			m--;
		}
	}
}