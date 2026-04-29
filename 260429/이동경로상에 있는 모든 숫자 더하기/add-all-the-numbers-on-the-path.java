import java.util.Scanner;

public class Main {
    private static boolean inRange(int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int p = n / 2;
        int x = p, y = p;
        int dir = 0;
        int sum = board[x][y];

        for (int i = 0; i < t; i++) {
            char cmd = commands.charAt(i);
            if (cmd == 'L')
                dir = (dir + 4 - 1) % 4;
            else if (cmd == 'R')
                dir = (dir + 1) % 4;
            else {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (inRange(nx, ny, n)) {
                    x = nx; y = ny;
                    sum += board[x][y];
                }
            }
        }
        System.out.println(sum);
    }
}