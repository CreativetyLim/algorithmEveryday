import java.util.Scanner;
import java.util.Stack;

public class stack {
	static boolean flag = true;
	static int count = 0; 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		inputString = inputString.replaceAll(" ", "");
		Stack<Character> s = new Stack<Character>();
		for(int i=0; i<inputString.length(); i++) {
			char tmp = inputString.charAt(i);
			if(tmp== '(' || tmp== '{' || tmp== '[' || tmp== '<') {
				s.add(tmp);
			}
			else if(tmp == ')'){
				if(!s.isEmpty()) {
					char outchar = s.pop();
					if(outchar != '(' ) {
						flag = false;
						break;
					}
					else {
						count ++;
					}
				}
				else {
					s.add(tmp);
					flag= false;
					break;
				}
			}
			else if(tmp == '}'){
				if(!s.isEmpty()) {
					char outchar = s.pop();
					if(outchar != '{' ) {
						flag = false;
						break;
					}
					else {
						count ++;
					}
				}
				else {
					s.add(tmp);
					flag= false;
					break;
				}
			}
			else if(tmp == ']'){
				if(!s.isEmpty()) {
					char outchar = s.pop();
					if(outchar != '[' ) {
						flag = false;
						break;
					}
					else {
						count ++;
					}
				}
				else {
					s.add(tmp);
					flag= false;
					break;
				}
			}
			else if(tmp == '>'){
				if(!s.isEmpty()) {
				char outchar = s.pop();
					if(outchar != '<' ) {
						flag = false;
						break;
					}
					else {
						count ++;
					}
				}
				else {
					s.add(tmp);
					flag= false;
					break;
				}
			}
		}
		if(!s.isEmpty()) {
			flag= false;
		}
		else {
			flag =true;
		}
		if(flag)
			System.out.println(count);
		else {
			System.out.println(-1);
		}
		
	}
}	
