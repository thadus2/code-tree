import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[][] dp = new int[n][n];
        int m = n - 1;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        // Please write your code here.
        dp[0][m] = matrix[0][m];
        for (int i = m - 1; i >= 0; i--) {
            dp[0][i] = dp[0][i + 1] + matrix[0][i];
        }
        for (int i = 1; i < n; i++) {
            dp[i][m] = dp[i - 1][m] + matrix[i][m];
        }
        for (int i = 1; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j + 1]) + matrix[i][j];
            }
        }        
        System.out.println(dp[m][0]);
    }
}