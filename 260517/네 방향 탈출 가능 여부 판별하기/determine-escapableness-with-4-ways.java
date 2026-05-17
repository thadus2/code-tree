import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    private static Queue<int[]> q = new ArrayDeque<>();
    private static boolean canGo(int x, int y, int[][] grid, int[][] visited) {
        return (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length &&
                grid[x][y] == 1 && visited[x][y] == 0);
    }
    private static int BFS(int[][] grid, int[][] visited) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        q.add(new int[]{0, 0});
        visited[0][0] = 1;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (canGo(nx, ny, grid, visited)) {
                    q.add(new int[]{nx, ny});

                    visited[nx][ny] = 1;
                }
            }
            if (x == (grid.length - 1) && y == (grid[0].length - 1)) 
                return 1;
        }
        return 0;
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
        System.out.println(BFS(grid, visited));
        
    }
}