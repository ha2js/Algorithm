import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) throws IOException {

		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		int test_case = 1;
		int n = sc.nextInt();
		sc.nextLine();
		while (n>0) {
			String str = sc.nextLine();
			String[] arr = new String[str.length()];
			arr = str.split(" ");
			System.out.print("Case #"+(test_case++)+": ");
			for (int i = arr.length-1; i>=0; i--) {
				if (i > 0) System.out.print(arr[i]+" ");
				else System.out.print(arr[i]);
			}
			System.out.println();
			n--;
		}
		sc.close();
	}
}