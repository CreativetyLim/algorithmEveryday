import java.util.Scanner;

public class µÎ¼öÀÇµ¡¼À {
	static boolean flag = false;
	static int size;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			String s1 = scan.next();
			String s2 = scan.next();
			
			int n = 0;
			size =Math.max(s1.length(),s2.length());

			while(n<size) {
				plus(s1,s2,n);
				n++;
			}
			
			System.out.println(s1);
		}
	}

	private static void plus(String s1, String s2,int n) {
		// TODO Auto-generated method stub
		
		int x =(s1.charAt(n)-'0')+(s2.charAt(n)-'0');
		if( flag ) {
			x= x+1;
		}
		s1 = s1.substring(0,n)+x%10+s1.substring(n+1);
		if(x> 10 ) {
			flag =true;
		}
		else {
			flag =false;
		}
	}
}
