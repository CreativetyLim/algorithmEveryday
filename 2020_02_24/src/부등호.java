import java.util.Arrays;
import java.util.Scanner;

public class ∫ŒµÓ»£ {
	boolean[] number = new boolean[10];
	static boolean[] visit = new boolean[10];
	static int n = 0;
	static long min = 9876543210l;
	static long max = 0;
	static int[] arr;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.next().charAt(0);
		}
		// < 60 > 62
		int[] result = new int[n + 1];
		pe(0, result);
		StringBuilder sbMax = new StringBuilder();
		StringBuilder sbMin = new StringBuilder();
		sbMax.append(max);
		sbMin.append(min);
		while(sbMax.length()!=n+1) {
			sbMax.insert(0, 0);
		}
		while(sbMin.length()!=n+1) {
			sbMin.insert(0, 0);
		}
		System.out.println(sbMax);
		System.out.println(sbMin);

	}

	private static void pe(int idx, int[] result) {
		// TODO Auto-generated method stub
		if (idx == n + 1) {
			int flag =0;
			for(int j =0; j<result.length-1; j++) {
				  if(arr[j]==60 &&  result[j] < result[j+1]) {
					  flag++; 
			} else if(arr[j]==62 && result[j] > result[j+1]) {
				  	flag++; 
				  } 
		    }
			if(flag+1 != idx) {
				return;
			}
		
			long sum = 0;
			for(int i=0; i<result.length; i++) {
			sum+= result[i]*(Math.pow(10, result.length-1-i));
			}
			
			max = Math.max(sum, max);
			min = Math.min(min, sum);
			return;
		}

		if (idx > n + 1) {
			return;
		}

		for (int i = 0; i < visit.length; i++) {
			if (!visit[i]) {
				result[idx] = i;
				visit[i] = true;
				pe(idx + 1, result);
				visit[i] = false;
			}
		}

	}
}
