import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Integer[] w = new Integer[10];
		Integer[] k = new Integer[10];
		int w_sum = 0;
		int k_sum = 0;

		for (int i=0; i<10; i++)
			w[i] = sc.nextInt();
		for (int i=0; i<10; i++)
			k[i] = sc.nextInt();

		Arrays.sort(w,Collections.reverseOrder());
		Arrays.sort(k,Collections.reverseOrder());
		for (int i=0; i<3; i++) {
			w_sum += w[i];
			k_sum += k[i];
		}
		System.out.println(w_sum+" "+k_sum);
	}
}