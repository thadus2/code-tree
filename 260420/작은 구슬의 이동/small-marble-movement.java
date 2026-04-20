import java.util.Scanner;

public class Main {
    // 격자 범위 내에 있는지 확인하는 함수
    private static boolean inRange(int x, int y, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        int R = sc.nextInt() - 1; 
        int C = sc.nextInt() - 1;
        char D = sc.next().charAt(0);

        int[] dr = {0, -1, 0, 1};
        int[] dc = {1, 0, -1, 0};

        int dir = "RULD".indexOf(D);

        while (T-- > 0) {
            int nr = R + dr[dir];
            int nc = C + dc[dir];

            if (!inRange(nr, nc, N)) {
                dir = (dir + 2) % 4;
            } else {
                R = nr;
                C = nc;
            }
        }

        System.out.println((R + 1) + " " + (C + 1));
    }
}