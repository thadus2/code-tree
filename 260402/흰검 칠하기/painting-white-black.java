import java.util.Scanner;
public class Main {
    private static final int OFFSET = 10;
    private static final int MAX_SIZE = 25;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tile[][] = new int[MAX_SIZE][2];
        int curr = OFFSET;
        int target;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            
            //white = 1, black = 2
            if (d == 'L') {
                target = curr - x + 1;
                for (int j = target; j <= curr; j++) {
                    tile[j][0] = 1;
                    tile[j][1]++;
                }
                curr = target;
            }
            if (d == 'R') {
                target = curr + x - 1;
                for (int j = curr; j <= target; j++) {
                    tile[j][0] = 2;
                    tile[j][1]++;
                }
                curr = target;
            }
        }
        // Please write your code here.
        int white = 0;
        int black = 0;
        int gray = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            if (tile[i][1] >= 4) {
                gray++;
                continue;
            }
            if (tile[i][0] == 1)
                white++;
            else if(tile[i][0] == 2)
                black++;
        }
        System.out.println(white + " " + black + " " + gray);
    }
}