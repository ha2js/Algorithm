// 1065 - 한수
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int cnt = 0;
		
		if (num < 100) 
			System.out.println(num);
		else {
			for (int i=100; i<=num; i++) {
				int hand = i / 100;
				int ten = (i % 100) / 10;
				int one = (i % 100) % 10;
				
				if ((hand-ten == ten-one) && (ten-hand == one-ten))
					cnt++;
			}
			System.out.println(99+cnt);
		}
		bf.close();
	}
}