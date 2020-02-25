import java.util.Arrays;

public class 중복조합 {
	static boolean[] visit = new boolean[4];
	static int[] arr= new int[] {1,2,3,4};
	public static void main(String[] args) {
		int[] result = new int[3];  // 3개를 뽑고싶어요,,,,!
		combi(0,result,0);
	}

	private static void combi(int idx,int[] result,int start) {
		// TODO Auto-generated method stub
		if( idx == 3 ){
			System.out.println(Arrays.toString(result));
			return ;
		}
		if( idx >2) {
			return;
		}
		
		for(int i=start; i<arr.length; i++  ) {
			visit[i] = true;
			result[idx]= arr[i];
			combi(idx+1,result, i);
			visit[i] =false;
		}
	}
}
