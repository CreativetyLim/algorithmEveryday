import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 도로수리 {
	static int max =0;
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	public static void main(String[] args) {
		String road= "001100";
		int n =5;
		for(int i=0; i <road.length(); i ++) {
			if(road.charAt(i) =='0') {
				arr.add(i);
			}
		}
		if(n>arr.size()) {
			n = arr.size();
		}
		int[] result = new int[n];
		combi(road,n, 0, result, 0);
		makeroad(road, null, n);
		System.out.println(max);
	}
	private static void combi(String road,int n,int idx, int[] result,int start) {
		// TODO Auto-generated method stub
		if( idx ==n) {
			makeroad(road,result,n);
			return;
		}
		
		for(int i= start; i <arr.size(); i++) {
				result[idx] = arr.get(i);
				combi(road,n,idx+1, result,i+1);
		}
	}
	private static void makeroad(String road, int[] result,int  n) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append(road);
		for(int i=0; i <n; i++) {
			if(result!=null)
			sb.setCharAt(result[i], '1');
		}
		String tmp = sb.toString();
		int j =0;
		int cnt =0;
		// 정으로
		while(tmp.length()-1 !=j) {
			if(tmp.charAt(j) =='1') {
				cnt++;
			}
			else {
				max= Math.max(cnt,max);
				cnt=0;
			}
		j++;
		}
		
		// 역으로
		j=tmp.length()-1;
		cnt=0;
		while(j>=0 &&tmp.charAt(j--)!='0') {
			cnt++;
		}
		max= Math.max(cnt, max);
	}
}
