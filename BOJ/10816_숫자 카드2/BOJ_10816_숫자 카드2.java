import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		
		for (int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if (map.containsKey(num)) 
				map.put(num, map.get(num)+1);
			
			else
				map.put(num, 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		tmp = br.readLine();
		st = new StringTokenizer(tmp);
		
		for (int i=0; i<m; i++) {
			int card = Integer.parseInt(st.nextToken());
			
			if (map.containsKey(card)) {
				int result = map.get(card);
				bw.write(map.get(card) + " ");
			}
			else bw.write("0 ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}