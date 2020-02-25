import java.util.Scanner;

public class 수이어쓰기 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int size= input.length();
		int result = 0;
		int num = Integer.parseInt(input);
		while(size>1) {
			result+= (num-(int)Math.pow(10, size-1)+1)*size;
			num = (int)Math.pow(10, size-1)-1;
			size--;
		}
		if(input.length()==1) {
			result+=num;
		}
		else {
			result+=9;
		}
		System.out.println(result);
	}
}
