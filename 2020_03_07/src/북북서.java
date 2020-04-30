import java.util.Scanner;

public class ºÏºÏ¼­ {
	static int d=0;
	static int count=0 ;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			String s = scan.next();
			if(s.charAt(s.length()-1)=='t') {
				d= 90;
				s= s.substring(0,s.length()-4);
			}
			if(s.length()>0) {
				direct(s,0);
			}
			if(count==0) {
				System.out.println("#"+t+" "+d);
			}
			else {
			System.out.println("#"+t+" "+ d+"/"+count*2);
			}
		}
	}

	private static void direct(String s,int n) {
		// TODO Auto-generated method stub
		System.out.println(s);
		if(s.charAt(s.length()-1) == 'h') {
			s= s.substring(0,s.length()-5);
			 
			if(d%2 ==0)
			d= d-90/(int)Math.pow(2, n);
			else
			count++;
		}
		else if(s.charAt(s.length()-1)== 't') {
			s= s.substring(0,s.length()-4);
			if(d%2 ==0)
			d= d+90/(int)Math.pow(2, n);
			else
				count++;
		}
		
		if(s.length()>0) {
			direct(s,n+1);
		}
	}
}
