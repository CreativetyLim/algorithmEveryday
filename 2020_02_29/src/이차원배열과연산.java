import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class num implements Comparable<num> {
	int number;
	int cnt=1;
	@Override
	public int compareTo(num o) {
		// TODO Auto-generated method stub
		if(this.cnt ==o.cnt) {
			return this.number-o.number;
		}
		return  this.cnt- o.cnt;
	} 
}
public class 이차원배열과연산 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();
		int[][] map = new int[r][c];
		for(int i =0; i <r; i++ ) {
			for(int j= 0; j<c; j++) {
				map[i][j] =scan.nextInt();
			}
		}
		if(r>= c) {
			ArrayList[] knowSize = new ArrayList[r];
			for(int i =0; i <r; i++ ) {
				ArrayList<num> list = new ArrayList<num>();
				for(int j= 0; j<c; j++) {
					boolean flag = false;
					for(int k1 = 0; k1 <list.size(); k1++) {
						num com =list.get(k1);
						if(map[i][j]!=0 &&com.number== map[i][j]) {
							list.get(k1).cnt++;
							flag =true;
						}
					}
					if(!flag) {
						num tmp = new num();
						tmp.number = map[i][j];
						list.add(tmp);
					}	
					
				}
				knowSize[i] = list;
				
			}
			int max = 0 ;
			for(int i =0; i<knowSize.length; i++) {
				Collections.sort(knowSize[i]);
				max = Math.max(max, knowSize[i].size());
			}
			int[][] newMap = new int[r][max*2];
			for(int i=0; i<r; i++) {
				for(int j =0; j<max*2; j=j+2) {
					if(knowSize[i].isEmpty()) {
						break;
					}
					num tmp = (num)knowSize[i].get(0);
					newMap[i][j] =tmp.number;
					newMap[i][j+1] =tmp.cnt;
					knowSize[i].remove(0);
				}
			}
			
			for(int i=0; i<newMap.length; i++) {
				for(int j =0; j<newMap[i].length; j++) {
					System.out.print(newMap[i][j] );
				}
				System.out.println();
			}
			
		}
		else {
			ArrayList knowsize[] = new ArrayList[r];
			for(int j= 0; j<c; j++) {
				ArrayList<num> list = new ArrayList<num>();
				for(int i =0; i <r; i++ ) {
					boolean flag = false;
					for(int k1 = 0; k1 <list.size(); k1++) {
						num com =list.get(k1);
						if(map[i][j]!= 0 &&com.number== map[i][j]) {
							list.get(k1).cnt++;
							flag =true;
						}
					}
					if(!flag) {
						num tmp = new num();
						tmp.number = map[i][j];
						list.add(tmp);
					}	
					
				}
				knowsize[j] = list;
				
			}
			int max = 0 ;
			for(int i =0; i<knowsize.length; i++) {
				Collections.sort(knowsize[i]);
				max = Math.max(max, knowsize[i].size());
			}
			int[][] newMap = new int[r][max*2];
				for(int j =0; j<max*2; j=j+2) {
					for(int i=0; i<r; i++) {
					if(knowsize[i].isEmpty()) {
						break;
					}
					num tmp = (num)knowsize[i].get(0);
					newMap[j][i] =tmp.number;
					newMap[j][i+1] =tmp.cnt;
					knowsize[i].remove(0);
				}
			}
		}
		
		
		
	}
}
