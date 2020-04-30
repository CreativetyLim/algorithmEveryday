import java.util.Scanner;

public class swea5215 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int T = scan.nextInt();
	
	for (int t = 1; t <= T; t++) {
		int N = scan.nextInt();
		int L = scan.nextInt();
		
		int[] food = new int[N];
		int[] cal = new int[N];
		
		for(int i =0; i < N ; i++) {
			food[i] = scan.nextInt();
			cal[i] = scan.nextInt();
		}
		
		/*
		 * int[][] dp = new int[n + 1][l + 1];
 
            for (int i = 1; i < dp.length; i++) {
                for(int j=1; j<ingredient[i-1][1]; j++){
                    if(dp[i][j]==0)
                        dp[i][j]=dp[i-1][j];
                }
                for (int j = ingredient[i - 1][1]; j < dp[i].length; j++) {
                    if (dp[i - 1][j - ingredient[i - 1][1]] + ingredient[i - 1][0] > dp[i - 1][j])
                        dp[i][j] = dp[i - 1][j - ingredient[i - 1][1]] + ingredient[i - 1][0];
                    else
                        dp[i][j] = dp[i - 1][j];
                }
            }
            System.out.println("#" + (t + 1) + " " + dp[n][l]);
		 */
		
	}
	
	}
}
