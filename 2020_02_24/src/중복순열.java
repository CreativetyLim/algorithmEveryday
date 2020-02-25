import java.util.Arrays;

public class 중복순열 {
	static int[] arr = new int[] {1,2,3,4};
	public static void main(String[] args) {
		int[] result = new int[4];
		combi(0,result);
	}
	private static void combi(int idx, int[] result) {
		// TODO Auto-generated method stub
		if( idx ==4) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for(int i =0 ; i < arr.length; i++) {
			result[idx] = arr[i];
			combi(idx+1,result);
		}
	}
}
