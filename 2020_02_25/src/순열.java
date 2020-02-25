import java.util.Arrays;

public class ¼ø¿­ {
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
		}
		for(int i =0 ;i < arr.length; i++) {
			if(!visit[i]) {
			
				visit[i] =true;
				result[idx] =arr[i];
				pe(idx+1,result);
				visit[i] =false;
			}
			
		}
	}
}
