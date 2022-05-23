import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		int[] num = new int[9];
		
		for (int i=0; i<n.length(); i++) {
			int tmp = n.charAt(i) - '0';
			
			if (tmp == 6 || tmp == 9) num[6]++;
			else num[tmp]++;
		}
		
		if (num[6] % 2 == 1) {
			num[6] /= 2;
			num[6]++;
		}
		else num[6] /= 2;

		int result = Integer.MIN_VALUE;
		for (int i=0; i<9; i++) {
			result = Math.max(result, num[i]);
		}
		
		System.out.println(result);
		br.close();	
	}
}