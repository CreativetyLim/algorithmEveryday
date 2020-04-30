import java.util.Scanner;

public class makeValue {
	static int[] tn;
	static int[] an;
	static int[] bn;
	static int[] mArr;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			int n  =scan.nextInt();
			tn=  new int[n+2];
			an=  new int[n+2];
			bn=  new int[n+2];
			for(int i=2; i <n+1; i++) {
				tn[i] = scan.nextInt();
				an[i] = scan.nextInt();
				bn[i] = scan.nextInt();
				System.out.println(tn[i] +" "+an[i]+" "+bn[i]);
			}
			int m = scan.nextInt();
			mArr= new int[m];
			for(int i =0; i <m; i++) {
				mArr[i] =scan.nextInt();
				System.out.println(find(n,mArr[i]));
			}
			
		}
		
	}
	private static int find(int n,int idx) {
		// TODO Auto-generated method stub
		//System.out.println(n+" " + idx);
		
		if(n==0) {
			return 1;
		}
		else if(n == 1) {
			return idx;
		}
		else {
			if(tn[n]==1) {
				return find(an[n],idx)+find(bn[n],idx);
			}
			else if(tn[n]==2) {
				return an[n]+find(bn[n],idx);
			}
			else if(tn[n]==3) {
				return find(an[n],idx)+bn[n];
			}
			else {
				return 0;
			}
		}
		
	}
}
