import java.util.Scanner;

public class backjun4963 {
	static int w = 1;
	static int h = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (w != 0) {
			w = scan.nextInt();
			h = scan.nextInt();
			int[][] map = new int[h][w];
			boolean[][] check = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = scan.nextInt();
				}
			}
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (check[i][j] == false && map[i][j] == 1) {
						dfs(i, j, check, map);
						cnt++;
					}
				}
			}
			if(w==0)break;
			System.out.println(cnt);

		}
	}

	private static void dfs(int i, int j, boolean[][] check, int[][] map) {
		// TODO Auto-generated method stub
		check[i][j] = true;
		int[] dirX = { -1, -1, -1, 0, 1, 1, 1, 0 };
		int[] dirY = { -1, 0, 1, 1, 1, 0, -1, -1 };

		int newX = 0;
		int newY = 0;
		for (int k = 0; k < 8; k++) {
			newX = i + dirX[k];
			newY = j + dirY[k];
			if (newX >= 0 && newY >= 0 && newX < h && newY < w && !check[newX][newY] && map[i][j] == 1) {
				dfs(newX, newY, check, map);
			}
		}

	}
}