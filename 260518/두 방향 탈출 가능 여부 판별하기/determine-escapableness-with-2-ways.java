import java.util.Scanner;
public class Main {
    private static int canEscape = 0;
    private static boolean canGo(int x, int y, int[][] grid, int[][] visited) {
        return (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length &&
                grid[x][y] == 1 && visited[x][y] == 0);
    }
    private static void DFS(int x, int y, int[][] grid, int[][] visited) {
        if ((x == (grid.length - 1) && y == (grid[0].length - 1)) || canEscape == 1) {
            canEscape = 1;
            return;
        }
        int[] dx = new int[]{0, 1};
        int[] dy = new int[]{1, 0};
        visited[x][y] = 1;

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (canGo(nx, ny, grid, visited)) {
                DFS(nx, ny, grid, visited);
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int[][] visited = new int[n][m];
        DFS(0, 0, grid, visited);
        System.out.println(canEscape);
    }
}