import java.util.Scanner;

public class ÇÑºóÀÌ¿Íspotmart {
	static int[] arr;
	static int m ; 
	static int max =-1 ;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			int n =scan.nextInt();
			m =scan.nextInt();
			
			arr = new int[n];
			for(int i=0; i <n; i++) {
				arr[i] =scan.nextInt();
				
			}
			combi(0,0,0);
			
			System.out.println("#"+t+" "+max);
			max =-1;
		}
		
	}
	private static void combi(int idx,int sum, int start) {
		// TODO Auto-generated method stub
		if(idx == 2) {
			if(sum>m) {
				return;
			}
			else if(max <sum){
				max = sum;
			}
			return;
		}
		
		for(int i=start; i<arr.length; i++) {
			combi(idx+1,sum+arr[i],i+1);
		}
		
	}
}
