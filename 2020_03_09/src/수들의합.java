import java.util.Scanner;

public class �������� {
	static boolean[] visit;
	static int n ; 
	static int m ;
	static int cnt=0; 
	static int[] arr;
	/**
	 * 
	 * 
	 * @param r: �̾ƾ��� ����
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		visit = new boolean[n];
		arr = new int[n];
		for(int i =0; i <n; i++) {
			arr[i] = scan.nextInt();
		}

		for(int i =0 ; i < n; i ++) {
			int sum=arr[i];
			if(sum== m) {
				cnt++;
				continue;
			}
			for(int j =i+1; j<n; j++) {
				sum+=arr[j];
				if(sum== m) {
					cnt++;
					break;
				}
				else if(sum >m) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
