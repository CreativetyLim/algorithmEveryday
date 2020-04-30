import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class swea_4050 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = scan.nextInt();
			PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
			// 배열 수 만 큼 숫자 입력 받기 .
			for(int i=0; i <n; i++) {
				q.add(scan.nextInt());
			}
			int cnt= 1;
			int sum = 0;
			
			while(!q.isEmpty()) {
				int tmp = q.poll();
				if(cnt%3 != 0) {
					sum+= tmp;
				}
				cnt++;
			}
			
			System.out.println("#"+t+" "+sum);
		}
		
	}
}
