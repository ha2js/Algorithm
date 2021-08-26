import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String[] from_arr = (sc.nextLine()).split("");
		String op = sc.nextLine();
		String [] to_arr = (sc.nextLine()).split("");
		
		int from_idx = from_arr.length;
		int to_idx = to_arr.length;
		
		String[] result = new String[(from_idx + to_idx)-1]; // 6
		if (from_idx < to_idx) {
			for (int i=0; i<to_idx; i++)
				result[i] = to_arr[i];
		}
		else {
			for (int i=0; i<from_idx; i++)
				result[i] = from_arr[i];
		}
  		switch (op) {
		case "+":
			if (from_idx < to_idx) {
				int tmp;
				tmp = from_idx;
				from_idx = to_idx;
				to_idx = tmp;
			}
			int temp = Integer.parseInt(result[from_idx-to_idx])+1;
			result[from_idx-to_idx] = String.valueOf(temp); 
			break;
		case "*":
			if (from_idx < to_idx) {
				for (int i=to_idx; i<(from_idx + to_idx)-1; i++)
					result[i] = "0";
			}
			else {
				for (int i=from_idx; i<(from_idx + to_idx)-1; i++)
					result[i] = "0";
			}
			break;
		}
		for (int i=0; i<result.length; i++) {
			if (result[i] != null) System.out.print(result[i]);
		}
	}
}