import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

class account{
	
}
public class transaction {
	public static void main(String[] args) {
		String[][] snapshots = {{"account1", "100"}, {"account2","150"}};
		String[][] transactions = {{"1", "SAVE", "ACCOUNT2", "100"},
					{"2", "WITHDRAW", "ACCOUNT1", "50"}, 
				  {"1", "SAVE", "ACCOUNT2", "100"}, 
				  {"4", "SAVE", "ACCOUNT3", "500"}, 
				  {"3", "WITHDRAW", "ACCOUNT2", "30"}};

		boolean[] visit = new boolean[100000];
		HashMap<String, Integer> account = new HashMap<String, Integer>();
		for(int i =0; i <snapshots.length; i++) {
			account.put(snapshots[i][0], Integer.parseInt(snapshots[i][1]));
		}
		
		for(int i =0; i <transactions.length; i++) {
			if(!visit[Integer.parseInt(transactions[i][0])]) {
				visit[Integer.parseInt(transactions[i][0])] =true;
				
				if(transactions[i][1]=="SAVE"){
					if(account.containsKey(transactions[i][2])) {
						account.put(transactions[i][2], account.get(transactions[i][2])+Integer.parseInt(transactions[i][3]));
					}
					else {
						
					}
				}
				else if(transactions[i][1]=="WITHDRAW") {
					if(account.containsKey(transactions[i][2])) {
						account.put(transactions[i][2], account.get(transactions[i][2])-Integer.parseInt(transactions[i][3]));
					}
				}
			}
		}
		
		
		String[][] answer = new String[account.size()][2];
		Iterator<String> keys = account.keySet().iterator();
		int var=0;
		while(keys.hasNext()) {
			String key = keys.next();
			answer[var][0] = key;
			answer[var][1] = ""+account.get(key);
			var++;
		}
		
		for(int i =0; i <answer.length; i ++) {
			System.out.println(Arrays.toString(answer[i]));
		}
		System.out.println(answer.length);
		
	}
}
