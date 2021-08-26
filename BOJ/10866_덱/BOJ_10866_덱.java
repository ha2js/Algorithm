// 10866 - 덱

import java.io.*;

import java.util.*;

public class Main {

 

	public static void main(String[] args) throws IOException {

		

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		

		int n = Integer.parseInt(bf.readLine());

		Deque<Integer> stack = new ArrayDeque<>();

		

		while (n > 0) {

			String tmp = bf.readLine();

			StringTokenizer st = new StringTokenizer(tmp);

			String command = st.nextToken();

			int num = 0;

			

			if (command.equals("push_front") || command.equals("push_back"))

				num = Integer.parseInt(st.nextToken());

			

			switch(command) {

			case "push_front" :

				stack.addFirst(num);

				break;

			case "push_back" :

				stack.addLast(num);

				break;

			case "pop_front" :

				if (stack.isEmpty()) System.out.println("-1");

				else {

					System.out.println(stack.getFirst());

					stack.removeFirst();

				}

				break;

			case "pop_back" :

				if (stack.isEmpty()) System.out.println("-1");

				else {

					System.out.println(stack.getLast());

					stack.removeLast();

				}

				break;

			case "size" :

				System.out.println(stack.size());

				break;

			case "empty" :

				if (stack.isEmpty()) System.out.println("1");

				else System.out.println("0");

				break;

			case "front" :

				if (stack.isEmpty()) System.out.println("-1");

				else System.out.println(stack.getFirst());

				break;	

			case "back" :

				if (stack.isEmpty()) System.out.println("-1");

				else System.out.println(stack.getLast());

				break;

			}

			n--;

		}

		bf.close();

	}

}