import java.util.Arrays;

public class �ߺ����� {
	static int[] arr = {1,2,3};
	public static void main(String[] args) {
		int[] result = new int[3];
		combi(0,result,0);
	}
	private static void combi(int idx, int[] result,int start) {
		// TODO Auto-generated method stub
		if( idx == result.length) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for(int i= start; i <arr.length; i++) {
				result[idx] = arr[i];
				combi(idx+1, result,i);
		}
	}
}
