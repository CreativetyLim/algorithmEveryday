package algo;

import java.util.Arrays;
import java.util.Scanner;

public class 성수의프로그래밍강좌시청 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int[] arr = new int[n];
			int[] arr2 = new int[k];
			for(int i = 0; i <n; i++) {
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			//arr2 = find(arr,k,0);
			float result= 0;
			for(int i=n-k; i<n; i++) {
				result = (result + arr[i])/2;
			}
			String str = String.format("%.6f", result);
			System.out.println("#"+t+" "+str);
		}
	}

	
}
