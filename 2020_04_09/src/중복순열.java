
public class 중복순열 {
	static int[] arr = {1,2,3,4};
	static boolean[] visit = new boolean[4];
	public static void main(String[] args) {
		
		int[] result = new int[3];
		permutation(0, result);
	}
	private static void permutation(int idx, int[] result) {
		// TODO Auto-generated method stub
		if(idx == 3) {
			for(int i =0; i <result.length; i++) {
				System.out.print(result[i]+ " ");
			}
			System.out.println();
			return;
		}
		for(int i=0; i <arr.length; i++) {
				result[idx] = arr[i];
				permutation(idx+1, result);
		}
	}
}
