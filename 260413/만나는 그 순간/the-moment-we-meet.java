import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] moves = new int[2];
        moves[0] = sc.nextInt();
        moves[1] = sc.nextInt();
        // Please write your code here.
        int[][] load = new int[100000][2];
        int[] pos = new int[]{1, 1};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < moves[i]; j++) {
                char d = sc.next().charAt(0);

                int t = sc.nextInt();
                
                int goal = pos[i] + t;
                if (d == 'L') {
                    while (pos[i] < goal) {
                        load[pos[i]][i] = load[pos[i] - 1][i] - 1;
                        pos[i]++;
                    }
                }
                if (d == 'R') {
                    while (pos[i] < goal) {
                        load[pos[i]][i] = load[pos[i] - 1][i] + 1;
                        pos[i]++;
                    }
                }
            }
        }
        for (int i = 1; i < pos[0]; i++) {
            if (load[i][0] == load[i][1]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}