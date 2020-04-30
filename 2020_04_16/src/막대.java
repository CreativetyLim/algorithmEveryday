
public class 막대 {
	static int[] arr = new int[100000];
	public static void main(String[] args) {
		
		int n = 8;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		if(n>4) {
		System.out.println(find(n));
		}
		else {
			System.out.println(arr[n]);
		}
	}
	private static int find(int n) {
		// TODO Auto-generated method stub
		
		
		if(arr[n] !=0) {
			return arr[n];
		}
		else {
			arr[n] = find(n-1)+find(n-2)+find(n-3);
			
			return arr[n];
		}
	}
}
