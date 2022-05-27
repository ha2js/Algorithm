import java.io.*;
import java.util.*;

public class Main {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while (n > 0) {
			String str = br.readLine();
			int tmp = 0;
			boolean[] visited = new boolean[26];
			
			for (int i=0; i<str.length(); i++) {
				if (visited[str.charAt(i) - 97]) {
					if (str.charAt(i) == str.charAt(i-1)) 
						tmp++;
				}
				else {
					visited[str.charAt(i) - 97] = true;
					tmp++;
				}
			}
			if (str.length() == tmp) cnt++;
			
			n--;
		}
		bw.write(cnt + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}