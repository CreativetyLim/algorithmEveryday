import java.util.Scanner;

public class 석찬이의받아쓰기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = scan.nextInt();
			int cnt = 0 ; 
				String s = scan.next();
				String s2 = scan.next();
				for(int j=0; j<s.length(); j++) {
					if(s.charAt(j)==s2.charAt(j)) {
						cnt++;
					}
				}
		System.out.println("#"+t+" " + cnt);
		}
		
	}
}
