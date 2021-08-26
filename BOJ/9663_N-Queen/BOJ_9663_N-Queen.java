import java.util.*;

public class Main {
	
	static int cnt = 0;
	static int n;
	static int[] arr = new int[15];
	
	public static boolean promising(int idx) {
		// 같은 열, 대각선 ㄴㄴ
		for (int i=0; i<idx; i++) {
			if (arr[idx] == arr[i] || idx-i == Math.abs(arr[idx] - arr[i]))
				return false;
		}
		return true;
	}
	
	// n-queen
	public static void Nqueen (int idx) {
		if (idx == n) {
			cnt++;
			return;
		}
		for (int i=0; i<n; i++) {
			arr[idx] = i;
			if (promising(idx))
				Nqueen(idx+1); // 되면 그 다음행에
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 8
		Nqueen(0);
		System.out.println(cnt);	
	}
}