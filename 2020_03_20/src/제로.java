import java.util.Scanner;
import java.util.Stack;

public class Á¦·Î {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int T = scan.nextInt();
	for (int t = 1; t <= T; t++) {
		int k = scan.nextInt();
		Stack<Integer> s = new Stack<Integer>();
		for(int i= 0 ; i <k; i++) {
			int tmp = scan.nextInt();
			if(tmp !=0) {
				s.add(tmp);
			}
			else {
				s.pop();
			}
		}
		int sum =0;
		while(!s.empty()) {
			sum+= s.pop();
		}
		System.out.println("#"+t+" " +sum);
	}
	
}
}
