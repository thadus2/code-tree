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

        for (int i = 1; i < 2050; i++) {

            line[i] += line[i - 1];

        }

        for (int i = 0; i < 2050; i++) {

            if (line[i] > 1)

                sum++;

        }

        System.out.println(sum);

    }

}