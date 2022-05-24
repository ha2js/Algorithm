import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int x = Integer.parseInt(br.readLine());
		int len = 64, cnt = 0;
		
		
		while (x > 0) {
			if (len > x) len /= 2;
			else {
				cnt++;
				x -= len;
			}
		}
		bw.write(cnt+"\n");
			
		bw.flush();
		bw.close();
		br.close();
	}
	
}