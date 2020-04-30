import java.util.Arrays;
import java.util.Scanner;

public class hanaro {
	static int n ;
	static int[] islandX;
	static int[] islandY;
	static boolean[] visit;
	static double fee;
	static double result=0;
	static double sum =0; 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			n = scan.nextInt();
			islandX = new int[n] ;
			islandY = new int[n] ;
			visit = new boolean[n];
			for(int i =0; i<n; i++) {
				islandX[i]= scan.nextInt();
				islandY[i]= scan.nextInt();
			}
			fee= scan.nextDouble();
			
			for(int i =0; i <n; i++) {
				if(!visit[i])
					find(i);
			}
			System.out.println("#"+t+" "+result);
			result = 0;
			sum =0;
		}
		
	}
	private static void find(int idx) {
		// TODO Auto-generated method stub
		double min = 0xffff;
		int minIdx =0;
		for(int i =0; i <visit.length; i++) {
			if(!visit[i] && i!= idx) {
				double tmp = Math.abs(islandX[i]-islandX[idx])+Math.abs(islandY[i]-islandY[idx]);
				if(tmp < min) {
					min = tmp;
					minIdx = i;
				}
			}
		}
		result += min ;
		System.out.println(result);
		visit[minIdx]= true;
		visit[idx]= true;
	}
}
