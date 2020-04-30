package algo;

import java.util.LinkedList;
import java.util.Scanner;

public class backjun2999 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		LinkedList<Integer> li = new LinkedList<>();
		for(int i = 1 ; i<= s.length(); i++) {
			if(s.length()%i == 0) {
				li.add(i);
			}
		}
	}
}
