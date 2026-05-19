import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static int n;
    private static int max = 0;
    private static ArrayList<int[]> pos = new ArrayList<>();
    private static int[][] grid;
    private static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    private static void checkBoom(int boom_no) {
        if (boom_no >= pos.size()) {
            int[][] dx = new int[][]{
                {-2, -1, 1, 2},
                {-1, 0, 1, 0},
                {-1, 1, 1, -1}
            };
            int[][] dy = new int[][]{
                {0, 0, 0, 0},
                {0, 1, 0, -1},
                {1, 1, -1, -1}
            };
            int sum = 0;
            for (int i = 0; i < pos.size(); i++) {
                int[] boom = pos.get(i);
                int x = boom[0];
                int y = boom[1];
                grid[x][y] = 2;
                int type = boom[2];
                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[type][j];
                    int ny = y + dy[type][j];
                    if (inRange(nx, ny)) {
                        grid[nx][ny] = 2;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 2)
                        sum++;
                }
            }
            if (max < sum)
                max = sum;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = 0;
                }
            }
            return;
        }
        for (int i = 0; i < 3; i++) {
            checkBoom(boom_no + 1);
            int[] boom = pos.get(boom_no);                   
            boom[2] = i;
        }            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sc.nextInt() == 1)
                    pos.add(new int[]{i, j, 1});
            }
        }
        // Please write your code here.
        checkBoom(0);
        System.out.println(max);
    }
}