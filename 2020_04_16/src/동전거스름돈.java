import java.util.Arrays;

public class 동전거스름돈 {
	public static void main(String[] args) {
		int n = 8;
		int[] c= new int[n+1];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = i;  // 1원짜리 필요한 갯수
		}
		// 1, 4 원 동전을모두 고려한 경우
		System.out.println(Arrays.toString(c));
		
		for (int i = 4; i < c.length; i++) {
			//c[i] : 1원짜리만 고려한 최소 갯수
			//c[i-4]+1 1, 4 원짜리 동전을 고려한 최소 갯수
			if(c[i] > c[i-4]+1) {
				c[i] = c[i-4]+1;
			}
			
		}
		System.out.println(Arrays.toString(c));
		for (int i = 6; i < c.length; i++) {
			//c[i] : 1원짜리만 고려한 최소 갯수
			//c[i-4]+1 1, 4 원짜리 동전을 고려한 최소 갯수
			if(c[i] > c[i-6]+1) {
				c[i] = c[i-6]+1;
			}
			
		}
		
		System.out.println(Arrays.toString(c));
		
	}
}
