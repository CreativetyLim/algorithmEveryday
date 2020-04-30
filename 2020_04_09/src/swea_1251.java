import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class swea_1251{
	static int parents[];
	static int rank[];
	// �Է��� ù�ٿ� ������ ������ ������ ������ ������
	// �� �����ٺ��ʹ� ������ ������ ����1 ����2 ����ġ�� ������ ������ŭ ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {

		int V=sc.nextInt();
		int E=sc.nextInt();
		int edges[][] = new int[E][3]; //������� 0, �������� 1, ����ġ�� 2
		for(int i=0;i<E;i++) {
			edges[i][0] = sc.nextInt();
			edges[i][1] = sc.nextInt();
			edges[i][2] = sc.nextInt();
		}
		//1. �������� ����ġ ������ ������ ����
		Arrays.sort(edges,new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				//o1[2] o2[2]
				return Integer.compare(o1[2], o2[2]);
			}
		});
		// ������ ���� -1�� �ݺ��ϸ鼭
		for(int i=0;i<V;i++) makeSet(i);
		int result = 0;
		int cnt = 0;
		for(int i=0;i<E;i++) {
			int a = findSet(edges[i][0]);
			int b = findSet(edges[i][1]);
			if(a==b) continue;
			union(a,b);
			//������ ����
			result += edges[i][2];
			//������ ���� -1�� �ݺ��ϸ� �׸�
			cnt++;
			if(cnt == V-1) break;
		}
		//������ �����ϴ� �� ������ ���� ���� �ƴ϶�� �� ������ �����ְ� ��������
		}
		//�������̶�� �н��Ѵ�.
		
	}
	static void makeSet(int x) {
		parents[x] = x;
	}
	static int findSet(int x) {
		if(x==parents[x]) return x;
		else {
			parents[x] = findSet(parents[x]);
			return parents[x];
		}
	}
	static void union(int x,int y) {
		int px = findSet(x);
		int py = findSet(y);
		if(rank[px] > rank[py]) {
			parents[py] = px;
		}
		else {
			parents[px] = py;
			if(rank[px]==rank[py]) {
				rank[py]++;
			}
		}
	}
}