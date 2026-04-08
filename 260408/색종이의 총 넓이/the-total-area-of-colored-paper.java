import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[201][201];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int dx = x; dx < x + 8; dx++) {
                for (int dy = y; dy < y + 8; dy++)
                    board[dx][dy]++;
            }
        }
        // Please write your code here.
        int volume = 0;
        for (int i = 0; i < 201; i++) 
            for (int j = 0; j < 201; j++)
                if (board[i][j] >= 1)
                    volume++;
        System.out.print(volume);
    }
}