import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean[][] board = new boolean[201][201];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt() + 100;
            int y = sc.nextInt() + 100;

            for (int dx = 0; dx < 8; dx++) {
                for (int dy = 0; dy < 8; dy++) {
                    board[x + dx][y + dy] = true;
                }
            }
        }

        int area = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (board[i][j]) area++;
            }
        }

        System.out.println(area);
    }
}
