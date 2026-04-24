import java.util.Scanner;

public class Main {
    private static boolean inRange(int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int[][] grid = new int[n][n];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            grid[x][y] = 1;
            int count = 0, dir = 0;
            for (int j = 0; j < 4; j++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (inRange(nx, ny, n) && grid[nx][ny] == 1) {
                    count++;
                }
                dir++;
            }
            if (count == 3)
                System.out.println(1);
            else
                System.out.println(0);
        }
        // Please write your code here.
    }
}