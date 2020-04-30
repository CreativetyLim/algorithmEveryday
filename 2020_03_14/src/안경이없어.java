import java.util.ArrayList;
import java.util.Scanner;

public class 안경이없어 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		ArrayList<Character> listB = new ArrayList<Character>();
		
		listB.add('A');
		listB.add('D');
		listB.add('O');
		listB.add('P');
		listB.add('Q');
		listB.add('R');
		for (int t = 1; t <= T; t++) {
			String s1 = scan.next();
			String s2 = scan.next();
			Boolean start = true;
			if(s1.length() != s2.length()) {
				System.out.println("#"+t+" DIFF");
				start =false;
			}
			if(start) {
			Boolean b =true;
			for(int i=0; i <s1.length(); i++) {
				if(s1.charAt(i)=='B') {
					if(s2.charAt(i)=='B') {
						continue;
					}
					else {
						System.out.println("#"+t+" DIFF");
						b =false;
						break;
					}
				}
				else if(listB.contains(s1.charAt(i))) {
					if(listB.contains(s2.charAt(i))) {
						continue;
					}
					else {
						System.out.println("#"+t+" DIFF");
						b =false;
						break;
					}
				}
				else {
					if(!listB.contains(s2.charAt(i))&& s2.charAt(i)!='B') {
						continue;
					}
					else {
						System.out.println("#"+t+" DIFF");
						b =false;
						break;
					}
				}
			}
			if(b) {
				System.out.println("#"+t+" SAME");
			}
			}
		}
	}
}
