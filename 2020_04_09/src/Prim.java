import java.util.Arrays;
import java.util.Scanner;

//7 11
//0 1 2
//0 2 2
//0 5 8
//1 2 1
//1 3 19
//2 5 5
//3 4 7
//3 5 11
//3 6 15
//4 5 9
//4 6 3

public class Prim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V=sc.nextInt();//정점의개수
		int E=sc.nextInt();//간선의개수
		int adj[][] = new int[V][V];
		//간선의 정보를 받는다.
		for(int i=0;i<E;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			adj[a][b]=c;
			adj[b][a]=c;
		}
		boolean check[] = new boolean[V];
		int key[] = new int[V]; //현재 선택된 정점들로부터 도달할 수 있는 최소거리
		int p[] = new int[V]; //최소신장트리의 구조를 저장할 배열
		Arrays.fill(key, Integer.MAX_VALUE); //key의 최댓값은 무한대!
		
		//아무거나 하나 선택! (처음선택되는 친구가 루트이므로, 부모는 없는걸로, 거리는 0인것으로)
		p[0]=-1;
		key[0]=0;
		for(int i=0;i<V-1;i++) { //이미 하나를 골랐으니 나머지 V-1개를 골라보자!
			int min = Integer.MAX_VALUE;
			//안골라진 친구들 중에서 key가 가장 작은 친구를 뽑자!
			int index = -1; //찾으면 그놈의 위치를 여기에 저장할거야
			for(int j=0;j<V;j++) {
				//일단 안골라진지 검사하고 key의 최소값을 기억해야됨
				if(!check[j] && key[j] < min) {
					index = j;
					min = key[j];
				}
			}
			//index : 선택이 안된 정점 중 key가 제일 작은 친구가 들어있다:)
			check[index] = true;
			//index정점에서 출발하는 모든 간선에 대해서 key를 업데이트
			for(int j=0;j<V;j++) {
				//check가 안되있으면서, 간선은 존재하고, 그 간선이 key값보다 작다면, key값을 업데이트!!
				if(!check[j] && adj[index][j]!=0 && key[j]>adj[index][j]) {
					p[j] = index;
					key[j] = adj[index][j];
				}
			}
		}
		int result=0;
		for(int i=0;i<V;i++) result+=key[i];
		System.out.println(result);
		System.out.println(Arrays.toString(p));
	}

}