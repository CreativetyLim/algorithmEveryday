import java.util.Arrays;

public class 중복순열 {
	static boolean[] visit = new boolean[3];
	static int[] arr = {1,2,3};
	public static void main(String[] args) {
		int[] result = new int[3];
		permutation(0,result);
	}
	private static void permutation(int idx, int[] result) {
		// TODO Auto-generated method stub
		if( idx == result.length) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for(int i= 0; i <visit.length; i++) {
		//	if(!visit[i]) {
			//	visit[i] =true;
				result[idx] = arr[i];
				permutation(idx+1, result);
				//visit[i]= false;
			//}
		}
	}
}
