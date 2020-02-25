import java.util.Arrays;

public class 중복조합 {
	static int[] arr = {1,2,3,4}; 
	static int num = 0;
	static boolean[] visit = new boolean[4];
	public static void main(String[] args) {
		num = 2;  // 3개 뽑고 싶어요..!!
		int[] result = new int[num];
		combi(0,result,0);
	}

	private static void combi(int idx,int[] result,int start) {
		// TODO Auto-generated method stub
		if(idx==num) {
			System.out.println(Arrays.toString(result));
			
			return ;
		}
		if(idx> num) {
			return;
		}
		
		for(int i =start; i <arr.length; i++) {
				result[idx] = arr[i];
				combi(idx+1,result,i);
		}
		
	}
}
