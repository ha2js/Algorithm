// 1436 - 영화 감독 숌
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while (n != 0) {
			cnt++;
			
			String str = Integer.toString(cnt);
			
			if (str.contains("666"))
				n--;
			
		}
		System.out.println(cnt);
		br.close();	
	}
}
