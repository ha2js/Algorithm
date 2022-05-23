import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String stick = br.readLine();
		int open = 0,close = 0,result = 0;
		
		for (int i=0; i<stick.length(); i++) {
			if (stick.charAt(i) == '(' && stick.charAt(i+1) == ')') {
				result += open + close;
				close = 0;
				i++;
			}
			else if (stick.charAt(i) == '(') {
				open++;
			}
			else if (stick.charAt(i) == ')') {
				open--;
				close++;
			}
		}
		System.out.println(result+open+close);
		br.close();	
	}
}
