import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] diff = new int[201];

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            diff[x1 + 100]++;   
            diff[x2 + 100]--;   
        }

        int max = 0;
        int cur = 0;

        for (int i = 0; i < diff.length; i++) {
            cur += diff[i];
            max = Math.max(max, cur);
        }

        System.out.println(max);
    }
}
