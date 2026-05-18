import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    private static Queue<int[]> q = new ArrayDeque<>();
    private static int n;
    private static int[][] grid;
    private static int[][] visited;

    private static boolean canGo(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n &&
                grid[x][y] == 0 && visited[x][y] == 0);
    }
    private static int BFS() {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int sum = 0;
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            // visited
            sum++; 
            // System.out.println(x + " " + y);

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (canGo(nx, ny)) {
                    visited[nx][ny] = 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        grid = new int[n][n];
        visited = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            visited[x][y] = 1;
            q.add(new int[]{x, y});
        }
        // Please write your code here.
        System.out.println(BFS());
    }
}