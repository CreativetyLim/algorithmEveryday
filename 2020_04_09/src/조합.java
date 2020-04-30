
public class 조합 {
	static int[] arr = {4,5,6,7};
	
	public static void main(String[] args) {
		int[] result = new int[3];
		comb(0,result,0);
	}
	private static void comb(int idx, int[] result,int start) {
		// TODO Auto-generated method stub
		if(idx == 3) {
			for(int i =0; i <3; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i =start; i<arr.length; i++) {
			result[idx] = arr[i];
			comb(idx+1,result,i);
		}
	}
}
