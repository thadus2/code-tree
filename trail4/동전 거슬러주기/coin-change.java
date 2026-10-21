import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coin = new int[n];
        for (int i = 0; i < n; i++)
            coin[i] = sc.nextInt();
        // Please write your code here.
        int[] dp = new int[m + 1];
        dp[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + coin[j] <= m && dp[i] != 0) {
                    if (dp[i + coin[j]] == 0) {
                        dp[i + coin[j]] = dp[i] + 1;
                    }
                    else {
                        dp[i + coin[j]] = Math.min(dp[i + coin[j]], dp[i] + 1);
                    }
                }
            }
        }
        if (dp[m] == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(dp[m] - 1);
        }
    }
}