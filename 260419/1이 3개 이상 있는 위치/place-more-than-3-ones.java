import java.util.Scanner;
public class Main {
    private static boolean isInRange(int x, int y, int size) {
        if (x >= 0 && x < size && y >= 0 && y < size)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int dr = 0;
                int count = 0;
                while (dr != 4) {
                    int next_x = i + dx[dr];
                    int next_y = j + dy[dr];
                    if (isInRange(next_x, next_y, n)) {
                        if (arr[next_x][next_y] == 1)
                            count++;
                    }
                    dr++;
                }   
                if (count >= 3)
                    total++;
            }
            
        }
        System.out.println(total);
    }
}