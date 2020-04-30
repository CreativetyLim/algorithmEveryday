import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 진용이의주차타워 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			Queue<Integer> q = new LinkedList<Integer>();
			int[] r_i = new int[n];
			int[] visit = new int[n];
			for(int i =0; i <n; i++) {
				r_i[i] =scan.nextInt();
			}
			int[] w_i = new int[m];
			for(int i=0; i <m; i++) {
				w_i[i] =scan.nextInt();
			}
			int[] input = new int[m*2];
			for(int i =0; i <m*2; i++) {
				input[i] = scan.nextInt();
			}
			
			int amount = 0;
			for(int i =0; i<input.length; i++) {
				for(int j=0; j<r_i.length; j++) {
					if(input[i]>0 && visit[j]==0) {
						amount+= w_i[input[i]-1]*r_i[j];
						visit[j]= input[i];
						break;
					}
					else if(input[i]>0 && j==r_i.length-1 &&visit[j]!=0) {
						q.add(input[i]);
					}
					else if(input[i]<0){
						if(visit[j] == input[i]*-1) {
							visit[j] =0;
							if(!q.isEmpty()) {
								visit[j]= q.poll();
								amount+= w_i[visit[j]-1]*r_i[j];
							}
						}
					}
				}
			}
			
			System.out.println("#"+t+" " +amount);
		}
	}
}
