package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSandBFS {
	static int[][] map;
	static boolean[] c;
	static Queue<Integer> q;
	public static void main(String[] args) {
		q = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		map = new int[n+1][n+1];
		for(int i=0; i < m; i++) {
			int a =scan.nextInt();
			int b =scan.nextInt();
			
			map[a][b] = 1;
			map[b][a] = 1; 
		}
		c = new boolean[n+1];
		bfs(k);
		
		
	}
	public static void bfs(int start) {
		System.out.println(start);
        q.add(start);
        c[start] = true;
        while (!q.isEmpty()) {
            int x = q.remove();
            for(int y=1; y<map[x].length; y++) {
            	
            }
        }
    }
}
