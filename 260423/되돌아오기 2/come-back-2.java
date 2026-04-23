import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.
        int x = 0, y = 0;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int dir = 0, time = 0;

        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            if (command == 'L') 
                dir = (dir + 4 - 1) % 4;        
            else if (command == 'R')
                dir = (dir + 1) % 4;
            else {
                x += dx[dir];
                y += dy[dir];
            }
            time++;
            if (x == 0 && y == 0) {
                System.out.println(time);
                return;
            }
        }
        System.out.println(-1);
    }
}