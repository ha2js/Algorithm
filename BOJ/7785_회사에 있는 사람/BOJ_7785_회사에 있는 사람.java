import java.io.*;
import java.util.*;

public class Main {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		TreeMap<String, String> map = new TreeMap<>(Collections.reverseOrder());
		
		while (T > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			String state = st.nextToken();
			
			if (state.equals("enter")) map.put(name, state);
			else map.remove(name);
				
			T--;
		}
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String res = iter.next();
			bw.write(res+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}