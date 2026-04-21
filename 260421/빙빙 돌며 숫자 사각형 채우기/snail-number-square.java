import java.util.Scanner;
public class Main {
    private static boolean inRange(int x, int y, int n, int m) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int[][] square = new int[n][m];
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int dir = 0, x = 0, y = 0;
        for (int i = 0; i < n * m; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (inRange(nx, ny, n, m) && square[nx][ny] == 0) {
                square[x][y] = i + 1;
                x = nx;
                y = ny;
            }
            else {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
                square[x][y] = i + 1;
                x = nx;
                y = ny;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}