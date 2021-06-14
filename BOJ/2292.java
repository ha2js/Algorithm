import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i=1,result=1;
		if (n == 1) System.out.println("1");
		else {
			for (i=1; true; i++) {
				result += 6*i;
				if (n <= result) break;
			}
			System.out.println(i+1);
		}
	}
}