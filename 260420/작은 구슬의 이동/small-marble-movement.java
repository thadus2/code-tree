import java.util.Scanner;

public class Main {
    private static boolean inRange(int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        char D = sc.next().charAt(0);
        // Please write your code here.
        int[][] grid = new int[N][N];
        grid[R][C] = 1;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int dir = "URDL".indexOf(D);
        while (T-- > 0) {
            int nx = R + dx[dir];
            int ny = C + dy[dir];
            if (!inRange(nx, ny, N))
                dir = (dir + 2) % 4;
            else {
                grid[R][C]--;
                R = nx;
                C = ny;
                grid[R][C]++;
            }
            System.out.println(R + " " + C);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 1) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}