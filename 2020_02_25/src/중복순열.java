import java.util.Arrays;

public class 중복순열 {
	static int[] arr = {1,2,3};
	static boolean[] visit =new boolean[3]; 
	public static void main(String[] args) {
		int result[] = new int[3];
		pe(0,result);
	}
	private static void pe(int idx,int[] result) {
		// TODO Auto-generated method stub
		if(idx == 3) {
			System.out.println(Arrays.toString(result));
			return;
		}
		for(int i =0 ;i < arr.length; i++) {
			result[idx] =arr[i];
			pe(idx+1,result);
		}
			
	}
}
