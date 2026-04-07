import java.util.Scanner;
public class Main {
    private static final int OFFSET = 1000;
    private static final int MAX_SIZE = 2 * OFFSET + 20;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] plain = new int[MAX_SIZE][MAX_SIZE];
        int ax1 = sc.nextInt() + OFFSET;
        int ay1 = sc.nextInt() + OFFSET;
        int ax2 = sc.nextInt() + OFFSET;
        int ay2 = sc.nextInt() + OFFSET;
        for (int i = ax1; i < ax2; i++) 
            for (int j = ay1; j < ay2; j++) 
                plain[i][j]++;

        int bx1 = sc.nextInt() + OFFSET;
        int by1 = sc.nextInt() + OFFSET;
        int bx2 = sc.nextInt() + OFFSET;
        int by2 = sc.nextInt() + OFFSET;
        for (int i = bx1; i < bx2; i++) 
            for (int j = by1; j < by2; j++) 
                plain[i][j]++;

        int mx1 = sc.nextInt() + OFFSET;
        int my1 = sc.nextInt() + OFFSET;
        int mx2 = sc.nextInt() + OFFSET;
        int my2 = sc.nextInt() + OFFSET;
        for (int i = mx1; i < mx2; i++) 
            for (int j = my1; j < my2; j++) 
                plain[i][j] = 0;

        int volume = 0;
        for (int i = 0; i < MAX_SIZE; i++) 
            for (int j = 0; j < MAX_SIZE; j++) 
                if (plain[i][j] == 1)
                    volume++;
        System.out.println(volume);
        // Please write your code here.
    }
}