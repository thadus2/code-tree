import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();
            // Please write your code here.
            int direction = 0;
            if (dir == 'N')
                direction = 0;
            if (dir == 'E')
                direction = 1;
            if (dir == 'S')
                direction = 2;
            if (dir == 'W')
                direction = 3;
            while (dist-- > 0) {
                x += dx[direction];
                y += dy[direction];
            }
        }
        System.out.println(x + " " + y);
    }
}