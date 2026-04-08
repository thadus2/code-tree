import java.util.Scanner;
public class Main {
    private static final int OFFSET = 100;
    private static final int MAX_SIZE = 2 * OFFSET + 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[MAX_SIZE][MAX_SIZE];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;

            for (int dx = x; dx < x + 8; dx++) {
                for (int dy = y; dy < y + 8; dy++)
                    board[dx][dy]++;
            }
        }
        // Please write your code here.
        int volume = 0;
        for (int i = 0; i < MAX_SIZE; i++) 
            for (int j = 0; j < MAX_SIZE; j++)
                if (board[i][j] >= 1)
                    volume++;
        System.out.print(volume);
    }
}