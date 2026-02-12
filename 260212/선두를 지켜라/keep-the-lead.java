import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt(); 
            A[i][1] = sc.nextInt(); 
        }

        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        int totalTime = 0;
        for (int i = 0; i < n; i++) {
            totalTime += A[i][1];
        }

        int[] A_pos = new int[totalTime];
        int[] B_pos = new int[totalTime];

        int curr = 0;
        int timeIdx = 0;
        for (int i = 0; i < n; i++) {
            int v = A[i][0];
            int t = A[i][1];

            for (int j = 0; j < t; j++) {
                curr += v;
                A_pos[timeIdx++] = curr;
            }
        }

        curr = 0;
        timeIdx = 0;
        for (int i = 0; i < m; i++) {
            int v = B[i][0];
            int t = B[i][1];

            for (int j = 0; j < t; j++) {
                curr += v;
                B_pos[timeIdx++] = curr;
            }
        }

        int prevLeader = 0; 
        int count = 0;

        for (int i = 0; i < totalTime; i++) {
            int leader = 0;

            if (A_pos[i] > B_pos[i]) leader = 1;
            else if (A_pos[i] < B_pos[i]) leader = 2;
            else continue;

            if (prevLeader == 0) {
                prevLeader = leader;
            } 
            else if (leader != prevLeader) {
                count++;
                prevLeader = leader;
            }
        }

        System.out.println(count);
    }
}
