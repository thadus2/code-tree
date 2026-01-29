import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] visit = new int[2001]; // -1000 ~ 1000 구간

        int cur = 0;
        int offset = 1000;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            int next = cur + (dir == 'R' ? x : -x);

            int start = Math.min(cur, next);
            int end = Math.max(cur, next);

            for (int p = start; p < end; p++) {
                visit[p + offset]++;
            }

            cur = next;
        }

        int result = 0;
        for (int i = 0; i < visit.length; i++) {
            if (visit[i] >= 2) result++;
        }

        System.out.println(result);
    }
}
