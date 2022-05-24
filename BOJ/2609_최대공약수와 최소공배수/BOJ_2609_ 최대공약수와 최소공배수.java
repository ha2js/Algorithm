import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int min = (num1 > num2) ? num2 : num1;
		int multiple = 1;
		
		// 최대공약수
		for (;; min--) {
			if ((num1 % min == 0) && (num2 % min == 0)) {
				bw.write(min+"\n");
				break;
			}
		}
		
		// 최소공배수
		for (;; multiple++) {
			if ((num1 * multiple) % num2 == 0) {
				bw.write((num1 * multiple)+"");
				break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}