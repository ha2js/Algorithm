// 11650 - 좌표 정렬하기
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for (int i=0; i<n; i++) { 
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int []>() {
			@Override
			public int compare(int a1[],int a2[]) {
				if (a1[0] == a2[0]) {
					return Integer.compare(a1[1],a2[1]);
					// 1열의 값이 같을 경우 2열의 값 비교
					// 작은게 위로
				}
				else return Integer.compare(a1[0],a2[0]);
			}	
		});
		for (int i=0; i<n; i++) System.out.println(arr[i][0]+" "+arr[i][1]);
		sc.close();
	}
}