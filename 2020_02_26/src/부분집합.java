
public class 부분집합 {
	static boolean[] visit = new boolean[3];
	public static void main(String[] args) {
		powerset(0,0);
	}
	private static void powerset(int idx,int a) {
		// TODO Auto-generated method stub
		if(idx == visit.length) {
			for(int i = 0; i <visit.length; i++) {
				if(visit[i])
					System.out.print(i+ " ");
			}
			System.out.println();
			return;
			
		}
		
		visit[a] =false;
		powerset(idx+1, a+1);
		visit[a] =true;
		powerset(idx+1, a+1);
		
	}
}
