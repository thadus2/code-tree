import java.util.Scanner;

public class Main {
    private static boolean inRange(int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();

        int x = 0, y = 0, count = 0, dir = 0;
        for (int i = 0; i < startNum - 1; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (inRange(nx, ny, n)) {
                x = nx;
                y = ny;
            }
            else
                dir = (dir + 1) % 4;
        }
        dir++;
        // Please write your code here.
        while(inRange(x, y, n)) {
            count++;
            if (grid[x][y] == '/') {
                if (dir % 2 == 0)
                    dir = (dir + 4 - 1) % 4;
                else
                    dir = (dir + 1) % 4;
            }
            else {
                if (dir % 2 == 0)
                    dir = (dir + 1) % 4;
                else
                    dir = (dir + 4 - 1) % 4;
            }
            x += dx[dir];
            y += dy[dir];            
        }
        System.out.println(count);
    }
}