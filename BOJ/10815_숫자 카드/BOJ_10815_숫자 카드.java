import java.io.*;
import java.util.*;

public class Main {
	
	public static boolean binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		int mid = (end + start) / 2;
		
		while (end - start >= 0) {
			if (arr[mid] == target)
				return true;
			
			else if (arr[mid] <= target)
				start = mid + 1;
			
			else
				end = mid - 1;
			
			mid = (end+start) / 2;
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];
		
		String tmp = bf.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		
		for (int i=0; i<n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(bf.readLine());
		tmp = bf.readLine();
		st = new StringTokenizer(tmp);
		
		for (int i=0; i<m; i++) {
			int card = Integer.parseInt(st.nextToken());
			
			boolean check = binarySearch(arr, card);
			
			if (check) System.out.print("1 ");
			else System.out.print("0 ");
		}
		bf.close();
	}
}