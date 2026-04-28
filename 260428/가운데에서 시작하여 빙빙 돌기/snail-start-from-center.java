import java.util.Scanner;
public class Main {
    private static boolean inRange(int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[][] grid = new int[n][n];
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        int x = n - 1, y = n - 1, dir = 3;
        for (int i = n * n; i > 0; i--) {
            grid[x][y] = i;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (!(inRange(nx, ny, n) && grid[nx][ny] == 0)) {
                dir = (dir + 4 - 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            x = nx;
            y = ny;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }

    }
}