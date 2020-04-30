import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class tictactoe {
	static char[][] map = new char[3][3] ;
	public static void main(String[] args) {
		Queue<E>
		int cnt = 0;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		// 맵 출력 
		for(int i =0; i <map.length; i++) {
			for(int j =0; j<map[i].length; j++) {
				map[i][j]= '.';
			}
		}
		
		System.out.println("선공을 시작하세요. x 좌표와 y 좌표를 입력해주세요");
		while(cnt<9) {
			System.out.println("x 좌표와 y 좌표를 입력해주세요");
		// User input
			boolean flag = true;
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			//갈 수 없는 조건
			if(x<3 && y<3 && x>=0 && y>=0 && map[x][y]!='O' && map[x][y]!='X') {
				map[x][y] = 'O';
				cnt ++;
			}
			else {
				System.out.println("말을 다시 놓으세요");
				flag= false;
			}
			if(flag) {
				int comX = random.nextInt(3);
				int comY = random.nextInt(3);
				while(!(comX<3 && comY<3 && comX>=0 && comY>=0 && map[comX][comY]!='O' && map[comX][comY]!='X') ) {
					comX = random.nextInt(3);
					comY = random.nextInt(3);
				}
				map[x][y] = 'O';
				cnt ++;
			}
			
			print();
		}
	}

	private static void print() {
		// TODO Auto-generated method stub
		System.out.println("현재 맵 입니다.");
		for(int i =0; i <3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
