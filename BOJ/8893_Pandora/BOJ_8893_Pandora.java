import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		while (T > 0) {
			int tmp1 = 0,tmp2 = 0;
			String inp = sc.nextLine();
			char[] arr = inp.toCharArray();
			int[] check = new int[arr.length];
			
			for (int i=0; i<check.length; i++) {
				if (i % 2 == 0 ) check[i] = 1;
				else check[i] = -1;
			}
			
			for (int i=0; i<arr.length; i++) {
				if (arr[i] == 'R') {
					if ((i+1 < arr.length) && arr[i+1] == 'R') {
						if (check[i] == -1 && check[i+1] == 1) tmp1 = 1;
						else if (check[i] == 1 && check[i+1] == -1) tmp2 = 1;
					}
				}
				if (tmp1+tmp2 == 2) break;
			}
			int result = tmp1 + tmp2;
			if ((arr[0] == arr[arr.length-1]) && arr[0] == 'R') result++;
			if (result >= 2) result = 0;
			else if (result == 0) result = 2;
			System.out.println(result);
			T--;
		}
	}
}