
public class 부분집ㅎ바 {
	static boolean[] visit = new boolean[3];
	public static void main(String[] args) {
		ilbu(0,0);
	}
	private static void ilbu(int idx, int start) {
		// TODO Auto-generated method stub
		if(idx == 3) {
			for(int i=0; i <visit.length; i++) {
				if( visit[i]) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
			return;
		}
		
		visit[start] =true;
		ilbu(idx+1,start+1);
		
		visit[start] =false;
		ilbu(idx+1,start+1);
		
	}
}
