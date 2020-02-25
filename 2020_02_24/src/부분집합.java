import java.util.Arrays;

public class 부분집합 {
	static boolean[] visit= new boolean[4];
	static int[] arr= {1,2,3,4};
	
	public static void main(String[] args) {
		int[] result = new int[4];
		ilbu(0,result);
	}

	private static void ilbu(int idx, int[] result) {
		// TODO Auto-generated method stub
		if(idx==4) {
			for(int i =0; i <visit.length;i++) {
				if(visit[i]) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			return;
		}
		if(idx>4) {
			return;
		}
		visit[idx]= false;
		ilbu(idx+1, result);
		visit[idx]= true;
		ilbu(idx+1,result);
		
	}
}
