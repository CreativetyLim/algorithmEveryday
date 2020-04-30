import java.util.Scanner;

public class swea_8821 {
	public static void main(String[] args) {
		boolean[] num = new boolean[10];
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
				String s =scan.next();
				for(int j=0; j< s.length(); j++) {
					num[s.charAt(j)-'0']= !num[s.charAt(j)-'0'];
				}
				int cnt = 0;
				for(int k=0; k<10; k++) {
					if(num[k]) {
						cnt++;
					}
				}
				
				System.out.println("#"+t+" "+cnt);
				num= new boolean[10];
			
		}
		
	}
}
