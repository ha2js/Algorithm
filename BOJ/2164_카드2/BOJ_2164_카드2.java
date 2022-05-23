import java.io.*;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		Deque<Integer> queue = new ArrayDeque<>();
		
		for (int i=1; i<=n; i++)
			queue.add(i);
		
		while (true) {
			if (queue.size() == 1) break;
			queue.removeFirst();
			queue.addLast(queue.getFirst());
			queue.removeFirst();
		}
		System.out.println(queue.getFirst());
		bf.close();
	}
}