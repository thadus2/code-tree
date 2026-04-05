import java.util.Scanner;
public class Main {
    private static final int OFFSET = 100000;
    private static final int MAX_SIZE = 2 * OFFSET + 20;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tile[] = new int[MAX_SIZE];
        int curr = OFFSET;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            // 1= white, 2 = black
            if (d == 'L') {
                while (x-- > 0) {
                    tile[curr] = 1;
                    if (x > 0)
                        curr--;
                }
            }
            if (d == 'R') {
                while (x-- > 0) {
                    tile[curr] = 2;
                    if (x > 0)
                        curr++;
                }
            }
        }
        // Please write your code here.
        int white = 0;
        int black = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            if (tile[i] == 1)
                white++;
            else if (tile[i] == 2)
                black++;
        }
        System.out.println(white + " " + black);
    }
}