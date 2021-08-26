import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {	
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(bf.readLine());
		while (n > 0) {
			String str = bf.readLine();
			
			StringTokenizer st = new StringTokenizer(str); // 공백 처리
			String tmp = st.nextToken();
			
			if (tmp.equals("push")) {
				int push_num = Integer.parseInt(st.nextToken());
				stack.push(push_num);
			}
			 
			else if (str.equals("pop")) {
				boolean check = stack.empty();
				if (check) {
					bw.write("-1");
					bw.newLine();
				}
				else {
					int top_num = stack.peek();
					stack.pop();
					bw.write(Integer.toString(top_num));
					bw.newLine();
				}
			}
			else if (str.equals("size")) {
				bw.write(Integer.toString(stack.size()));
				bw.newLine();
			}
			
			else if (str.equals("empty")) {
				boolean check = stack.empty();
				if (check) { 
					bw.write("1");
					bw.newLine();
				}
				else {
					bw.write("0");
					bw.newLine();
				}
			}
			else if (str.equals("top")) {
				boolean check = stack.empty();
				if (check) {
					bw.write("-1");
					bw.newLine();
				}
				else { 
					bw.write(Integer.toString(stack.peek()));
					bw.newLine();
				}
			}
			n--;
		}
		bf.close();
		bw.close();
		stack.clear();
	}
}