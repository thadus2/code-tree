import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int dir = 0;
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char command = s.charAt(i);
            if (command == 'L') 
                dir = (dir - 1 + 4) % 4;
            else if (command == 'R')
                dir = (dir + 1) % 4;
            else if (command == 'F') {
                x += dx[dir];
                y += dy[dir];
            }
        }
        System.out.println(x + " " + y);        
    }
}