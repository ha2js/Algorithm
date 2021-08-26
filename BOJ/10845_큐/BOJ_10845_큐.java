import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		Queue<Integer> queue = new LinkedList<>();
		int add = Integer.MIN_VALUE;
		int n = Integer.parseInt(bf.readLine());
		
		while (n > 0) {
			String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str);
			String push_str = st.nextToken();
			
			if (push_str.equals("push")) {
				add = Integer.parseInt(st.nextToken());
				queue.add(add);
			}
			else if (str.equals("pop")) {
				if (queue.peek() == null)
					System.out.println("-1");
				else
					System.out.println(queue.poll());
			}
			else if (str.equals("size")) {
				System.out.println(queue.size());
			}
			else if (str.equals("empty")) {
				if (queue.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
			}
			else if (str.equals("front")) {
				if (queue.isEmpty())
					System.out.println("-1");
				else
					System.out.println(queue.peek());
			}
			else if (str.equals("back")) {
				if (queue.isEmpty() || add == Integer.MIN_VALUE)
					System.out.println("-1");
				else
					System.out.println(add);
			}
			n--;
		}
		bf.close();
		bw.close();
	}
}