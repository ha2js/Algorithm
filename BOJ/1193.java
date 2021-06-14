import java.util.*;

public class Main {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,from,n;
		int step = 2;
		int cnt = 1;
		int inp = sc.nextInt();
		boolean chk = false;
		
		while (true) {
			if (inp == 1) {
				System.out.println("1/1");
				break;
			}
			if (step % 2 == 0) {
				n = step;
				from = n;
				for (int i=1; i<=from; i++) {
					num1 = i;
					num2 = n--;
					cnt++;
					if (cnt == inp) {
						System.out.println(num1+"/"+num2);
						chk = true;
						break;
					}
				}
				if (chk) break;
				step++;
			}
			else if (step % 2 == 1) {
				n = step;
				from = n;
				for (int i=1; i<=from; i++) {
					num1 = n--;
					num2 = i;
					cnt++;
					if (cnt == inp) {
						System.out.println(num1+"/"+num2);
						chk = true;
						break;
					}
				}
				if (chk) break;
				step++;
			}	
		}
	}
}