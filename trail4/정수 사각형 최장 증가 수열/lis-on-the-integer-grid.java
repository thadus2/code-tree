import java.util.Scanner;

public class Main {
    private static int n;
    private static int[][] dp;
    private static int[][] grid;
    private static int[] dx = new int[] {0, 1, 0, -1};
    private static int[] dy = new int[] {1, 0, -1, 0};
    private static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    private static void dfs(int x, int y) {
        if (dp[x][y] != 0) return;

        if (grid[x][y] == 1) dp[x][y] = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (inRange(nx, ny) && grid[x][y] > grid[nx][ny]) {
                // return Math.max(dp[x][y],dfs(nx, ny)) + 1;
                dfs(nx, ny);
                dp[x][y] = Math.max(dp[x][y], dp[nx][ny] + 1);
            }
        }
        if (dp[x][y] == 0) dp[x][y] = 1;
        // return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dfs(i, j);
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dp[i][j]);
            }
            
        }
        System.out.println(max);
    }
}