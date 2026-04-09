import java.util.Scanner;
public class Main {
    private static final int OFFSET = 100;
    private static final int MAX_SIZE = 2 * OFFSET + 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] plain = new int[MAX_SIZE][MAX_SIZE];
        int color = 1;
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int x = x1; x < x2; x++) 
                for (int y = y1; y < y2; y++)
                    plain[x][y] = color;
            
            color = color % 2 + 1;
        }
        // Please write your code here.
        int blue = 0;
        for (int x = 0; x < MAX_SIZE; x++)
            for (int y = 0; y < MAX_SIZE; y++)
                if (plain[x][y] == 2)
                    blue++;
        System.out.println(blue);
    }
}