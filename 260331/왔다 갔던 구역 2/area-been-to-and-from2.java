import java.util.Scanner;

public class Main {

    private final static int OFFSET = 1000;
    private final static int MAX_SIZE = 2050;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int line[] = new int[MAX_SIZE];
        int curr = OFFSET;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.

            if (dir == 'L') {
                line[curr]--;
                line[curr - x]++;
                curr -= x;
            }
            if (dir == 'R') {
                line[curr]++;
                line[curr + x]--;
                curr += x;
            }                
        }

        int sum = 0;
        for (int i = 1; i < MAX_SIZE; i++) {
            line[i] += line[i - 1];
        }

        for (int i = 0; i < MAX_SIZE; i++) {
            if (line[i] > 1)
                sum++;
        }
        System.out.println(sum);
    }
}