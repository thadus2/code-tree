import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int line[] = new int[2050];
        int curr = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if (dir == 'L') {
                for (int j = curr - x; j < curr; j++)
                    line[j]++;
                curr -= x;
            }
            if (dir == 'R') {
                for (int j = curr; j < curr + x; j++)
                    line[j]++;
                curr += x;
            }
        }
        int sum = 0;
        for (int i = 0; i < 2050; i++) {
            if (line[i] > 1)
                sum++;
        }
        System.out.println(sum);
    }
}