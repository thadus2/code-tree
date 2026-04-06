import java.util.Scanner;
public class Main {
    private static final int OFFSET = 100;
    private static final int MAX_SIZE = OFFSET * 2 + 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean d[][] = new boolean[MAX_SIZE][MAX_SIZE];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    d[j][k] = true;
                }
            } 
        }
        // Please write your code here.
        int v = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < MAX_SIZE; j++) {
                if (d[i][j])
                    v++;
            }
        }
        System.out.println(v);
    }
}