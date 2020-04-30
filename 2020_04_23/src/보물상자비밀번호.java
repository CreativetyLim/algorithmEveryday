import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 보물상자비밀번호 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			
			int n= scan.nextInt();
			int k= scan.nextInt();
			
			String s =scan.next();
			List<Integer> list = new ArrayList<>();
			for(int i=0; i<n/4; i++) {
				int start= 0;
				int end = n/4; 
				for(int j=0; j<4; j++) {
					String hex= s.substring(start,end);
					int num = Integer.parseInt(hex,16);
					if(!list.contains(num)) list.add(num);
					start= end;
					end += n/4;
				}
				char c= s.charAt(n-1);
				s= c+s.substring(0,n-1);
			}
			Collections.sort(list);
			System.out.println("#"+t+list.get(list.size()-k));
		}
		
	}
}
