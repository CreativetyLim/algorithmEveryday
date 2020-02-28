import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
class alph implements Comparable<alph>{
	char word;
	int cnt;
	@Override
	public int compareTo(alph o) {
		// TODO Auto-generated method stub
		return o.cnt-this.cnt;
	}
}
public class 단어수학 {
	static char[] num = new char[10];
	static int numbering = 9;
	static int maxSize = 0;
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n =scan.nextInt();
		String[] input = new String[n]; 
		String maxSizeInput ="";
		for(int i =0; i <n; i++) {
			input[i]= scan.next();
			if( maxSize < input[i].length()) {
				maxSize = input[i].length();
				maxSizeInput = input[i];
			}
		}
		Arrays.sort(input,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				String s1 = (String) o1;
				String s2 = (String) o2;
				if(s2.length()==s1.length()) {
					return s2.charAt(0)-s1.charAt(0);
				}
				return s2.length()-s1.length();
			}
		});
		find(0,input,n);
		System.out.println(Arrays.toString(num));
		int sum = 0;
		for(int i = 0; i <n; i ++) {
			int s =1;
			for(int j = input[i].length()-1; j>=0; j--) {
				for(int k=0; k<10; k++) {
					if(num[k] == input[i].charAt(j)) {
					sum+= k*s;
					s*=10;
					}
				}
			}
		}
		System.out.println(sum);
	}
	private static void find(int idx,String[] input,int n) {
		// TODO Auto-generated method stub
		if(maxSize==idx || numbering==-1){
			return;
		}
		alph[] alphabet = new alph[26];
		for(int i =0; i <alphabet.length; i++) {
			alphabet[i] =new alph();
		}
		int tmpMax = 0;
		int maxIndex= 0;
		for(int i =0; i <n; i++) {
			if(input[i].length()-1>=idx && input[i].length()== maxSize) {
				alphabet[(input[i].charAt(idx))-'A'].cnt++;
				alphabet[(input[i].charAt(idx))-'A'].word=input[i].charAt(idx);
			}
		}

		Arrays.sort(alphabet);
		for(int i = 0; i <alphabet.length; i++) {
			boolean flag = true;
			if(alphabet[i].word<1  ) {
				break;
			}
			for(int j=9; j>=0; j--) {
				if(alphabet[i].word == num[j]) {
					flag=false;
					break;
				}
			}
			if(flag) {
				num[numbering] = alphabet[i].word;
				numbering--;
			}
		}
		maxSize--;
		find(idx+1,input,n);
	}
}
