import java.util.Scanner;

public class usb {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int T = scan.nextInt();
	for (int t = 1; t <= T; t++) {
		
		double p = scan.nextDouble();
		double q = scan.nextDouble();
	
		double s1 =(1-p) *q;
		double s2 =p * (1-q) *q;
		
		System.out.print("#"+t+" ");
		if(s1<s2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
}
}
