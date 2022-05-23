import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] check = new int[2][4001];
		int[] middle = new int[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		double avg, sum = 0;
		
		for (int i=0; i<n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			sum += tmp;
			middle[i] = tmp;
			
			if (tmp > 0) check[0][tmp]++;
			else {
				tmp *= -1;
				check[1][tmp]++;
			}
		}
		int max = 0;
		for (int i=0; i<2; i++) {
			for (int j=0; j<4001; j++) {
				if (check[i][j] != 0 && check[i][j] >= max) {
					max = check[i][j];
				}
			}
		}
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<4001; j++) {
				if (check[i][j] == max) {
					if (i == 0) list.add(j);
					else {
						int tmp = j * -1;
						list.add(tmp);
					}
				}
			}
		}
		avg =  Math.round(sum/n);
		Arrays.sort(middle);
		Collections.sort(list);
		
		System.out.println((int)avg);
		System.out.println(middle[n/2]);
		if (list.size() > 1) System.out.println(list.get(1));
		else System.out.println(list.get(0));
		System.out.println(middle[n-1] - middle[0]);
		
		br.close();	
	}
}