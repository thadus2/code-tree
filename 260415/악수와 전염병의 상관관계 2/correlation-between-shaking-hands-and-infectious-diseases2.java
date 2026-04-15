import java.util.Scanner;
public class Main {
    private static final int MAX_SIZE = 250 * 250 + 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        int[] devs = new int[N + 1];
        devs[P]++;
        int[][] shakes = new int[MAX_SIZE][2];
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            shakes[t][0] = sc.nextInt();
            shakes[t][1] = sc.nextInt();  
        }
        // Please write your code here.
        for (int i = 0; i < MAX_SIZE; i++) {
            if (shakes[i][0] != 0) {
                int dev1 = shakes[i][0], dev2 = shakes[i][1];
                if ((K >= devs[dev1] && devs[dev1] >= 1) || 
                    (K >= devs[dev2] && devs[dev2] >= 1)) {
                    devs[dev1]++;
                    devs[dev2]++;
                }
            }
        }
        for (int i = 1; i < N + 1; i++)
            if (devs[i] >= 1)
                System.out.print(1);
            else
                System.out.print(0);
    }
}