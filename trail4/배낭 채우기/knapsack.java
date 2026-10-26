import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] dp = new int[m + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 0; j--) {
                int temp = j - w[i];
                if (temp >= 0 && dp[temp] != 0) {
                    dp[j] = Math.max(dp[j], dp[temp] + v[i]);
                }
            }
        }
        int max = 0;
        for (int i = 0; i <= m; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max - 1);
    }
}