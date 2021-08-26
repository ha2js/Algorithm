// 2581 - 소수
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0, min = Integer.MAX_VALUE;
		
		for (int i=M; i<=N; i++) {
			boolean flag = true;
			if (i == 1) 
				flag = false;
			
			for (int j=2; j<i; j++) {
				if (i % j == 0) 
					flag = false;
			}
			if (flag) {
				sum += i;
				if (min > i) 
					min = i;
			}
		}
		if (sum > 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else System.out.println("-1");
		
		br.close();	
	}
}
