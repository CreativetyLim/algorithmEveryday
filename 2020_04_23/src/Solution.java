import java.util.ArrayList;
import java.util.HashMap;

class person {
	String ip ;
	String langs;
	int scores;
	boolean flag;
	public person(String ip, String langs, int scores,boolean flag) {
		// TODO Auto-generated constructor stub
		this.ip = ip;
		this.langs = langs;
		this.scores = scores;
		this.flag = flag;
	}
}

public class Solution {
public static void main(String[] args) {
	
	String[] ip = {"5.5.5.5", "155.123.124.111", "10.16.125.0", "155.123.124.111", "5.5.5.5", "155.123.124.111", "10.16.125.0", "10.16.125.0"};
	String[] langs = {"Java", "C++", "Python3", "C#", "Java", "C", "Python3", "JavaScript"};
	int[] scores = {294, 197, 373, 45, 294, 62, 373, 373};
	
	
	ArrayList<person> list  = new ArrayList<person>();
	list.add(new person(ip[0],langs[0], scores[0], false));
	// 같은 ip person 객체 만들기
	int answer = 0;
	for(int i =1; i < ip.length; i++) {
		
		list.add(new person(ip[i],langs[i], scores[i], false));
		
		
		for(int j=0; j< list.size(); j++) {
			if(ip[i].equals(ip[j])) {
				list.get(i).flag =true;
				list.get(j).flag =true;
			}
			
		}
		
		
	}
	
	
	

}
}
