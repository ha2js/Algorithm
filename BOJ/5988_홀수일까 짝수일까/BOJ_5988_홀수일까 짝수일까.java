import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

	
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while (n>0) {
			String str = sc.next();
			int idx = str.length();
			char num = str.charAt(idx-1);
			int result = ((int)num)-48;
		
			
			if (result % 2 == 0)
				System.out.println("even");
			else
				System.out.println("odd");
			n--;
		}
	}
}