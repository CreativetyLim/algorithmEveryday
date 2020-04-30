

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// pq x 간선이 매우 많을 때 유리!
public class Dijkstra_인접리스트 {
	static class Node implements Comparable<Node> {
		int v, weight;

		public Node(int v, int weight) {
			this.v = v;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.weight, o.weight);
		}
	}

	private static final int INF = Integer.MAX_VALUE;
	static int V, E, K;
	static List<Node>[] list;
	static int[] dist;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		K = sc.nextInt();
		list = new ArrayList[V + 1];
		dist = new int[V + 1];

		Arrays.fill(dist, INF);
		for (int i = 1; i <= V; i++) {
			list[i] = new ArrayList<>();
		}
		
		// 리스트에 그래프 정보를 초기화
		//출발 도착 가중치
		for (int i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int weight = sc.nextInt();
			list[u].add(new Node(v, weight));
		}

		// 다익스트라 알고리즘
		dijkstra(K);
		// 출력 부분
		for (int i = 1; i <= V; i++) {
			if (dist[i] == INF)
				System.out.println("INF");
			else {
				System.out.println(dist[i]);
			}
		}
	}

	static void dijkstra(int st) {
		//선택배열
		boolean[] check = new boolean[V + 1];
		
		//시작노드까지 거리는 0
		dist[st] = 0;

		for (int i = 0; i < V-1; i++) {
			//최소값과 최소위치를 뽑기위한 준비
			int minIdx = -1;
			int min = 987654321;
			//선택하지 않은 정점중 가장 dist길이 짧은 것을 고른다.
			for (int j = 1; j < V + 1; j++) {
				if (!check[j] && min > dist[j]) {
					min = dist[j];
					minIdx = j;
					
				}
			}
			//연결되지 않은 경우도 있기 때문에
			if(minIdx == -1) {
				break;
			}
			//거리가 작은곳은 방문했다고 표시
			check[minIdx] = true;

			for (int k = 0; k < list[minIdx].size(); k++) {
				Node cur = list[minIdx].get(k);
				//minIdx를 정점으로 갖는 리스트 중에 방문하지 않았고 이미 알고있는 거리보다 더 가깝게 도달할 수 있다면
				if(!check[cur.v] && dist[cur.v] > dist[minIdx] + cur.weight) {
					//거리생신
					dist[cur.v]= dist[minIdx]+cur.weight; 
				}
			}
		}
	}
}
