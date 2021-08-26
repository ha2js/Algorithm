import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//Scanner sc = new Scanner(System.in);
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		TreeMap<String,Integer> inp = new TreeMap<>();
		List<String> result = new ArrayList<>();
		
		
		for (int i=0; i<n; i++) // 500,000
			inp.put(bf.readLine(),1);
		
		for (int i=0; i<m; i++) { // 500,000
			String str = bf.readLine();
			if (inp.containsKey(str)) {
				result.add(str);
				cnt++;
			}
		}
		System.out.println(cnt);
		Collections.sort(result);
		for (int i=0; i<result.size(); i++)
			System.out.println(result.get(i));

		bf.close();
		bw.close();
	}
}