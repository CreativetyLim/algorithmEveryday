import java.util.Scanner;


public class 단어의개수 {
	public static void main(String[] args) {
		int cnt = 0;
		Scanner scan =new Scanner(System.in);
		String s = scan.nextLine();
		if(s.charAt(0) == ' ') {
			if(s.length()>1) {
				int i = 1;
				while(i <s.length()) {
					if(s.charAt(i)== ' ') {
						cnt++;
					}
					i++;
				}
				cnt = cnt+1;
				if(s.charAt(s.length()-1)== ' ') {
					cnt--;
				}
			}
		}
		else {
			int i = 1;
			while(i <s.length()) {
				if(s.charAt(i)== ' ') {
					cnt++;
				}
				i++;
			}
			cnt = cnt+1;
			if(s.charAt(s.length()-1)== ' ') {
				cnt--;
			}
		}
		System.out.println(cnt);
	}
}
