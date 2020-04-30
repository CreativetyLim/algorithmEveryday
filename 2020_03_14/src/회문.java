import java.util.Scanner;

public class 회문 {
	static int max =  0;
	static String[] s ;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = 10;
		for (int t = 1; t <= T; t++) {
			int B = scan.nextInt();
				// 100 x 100 씩 들어옴
			s = new String[100];
			for(int i =0; i < 100; i ++) {
				s[i] = scan.next();
			}
				int len = 0;
				for(int k=0; k< 100 ; k++) {
				for(int i =0; i <100; i++) {
					for(int j =99; j>=0; j--) {
						if(s[k].charAt(i)== s[k].charAt(j)) {
							check(i,j,0,s[k]);
						}
					}
				}
				}
				for(int k =0; k < 100; k++) {
					for(int i =0; i <100; i++) {
						for(int j =99; j>=0; j--) {
							if(s[i].charAt(k)== s[j].charAt(k)) {
								colcheck(i,j,0,k);
							}
						}
					}
				}
			System.out.println("#"+t+" "+max);
			max = 0;
		}
	}

	private static void colcheck(int i, int j, int cnt,int k ) {
		// TODO Auto-generated method stub
		if( i==j ) {
			cnt++;
			if( max <cnt) {
				max = cnt;
			}
			return;
		}
		else if (i> j) {
			if( max < cnt) {
				max =cnt;
			}
		}
		else {
			if(s[i+1].charAt(k) == s[j-1].charAt(k)) {
				colcheck(i+1,j-1,cnt+2,k);
				
			}
		}
	}

	private static void check(int i, int j,int cnt,String s) {
		// TODO Auto-generated method stub
		
		if( i==j ) {
			cnt++;
			if( max <cnt) {
				max = cnt;
			}
			return;
		}
		else if (i> j) {
			if( max < cnt) {
				max =cnt;
			}
		}
		else {
			if(s.charAt(i+1) == s.charAt(j-1)) {
				check(i+1,j-1,cnt+2,s);
				
			}
		}
	}
}
