import java.util.Scanner;
public class Main {
    private static int OFFSET = 1000;
    private static int SIZE = 2 * OFFSET + 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[SIZE][SIZE];
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int x = OFFSET, y = OFFSET;
        int time = 0;
        grid[x][y] = 1;
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int d = "NESW".indexOf(dir);
            int dist = sc.nextInt();
            while(dist-- > 0) {
                time++;
                x += dx[d];
                y += dy[d];
                if (grid[x][y] == 1) {
                    System.out.println(time);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}