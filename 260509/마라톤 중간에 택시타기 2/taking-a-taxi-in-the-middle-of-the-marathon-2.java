import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = 9999999;
        for (int i = 1; i < n - 1; i++) {
            int curr_sum = 0;
            for (int j = 0; j < n - 1; j++) {
                if (j == i)
                    continue;
                if (j + 1 == i) {
                    curr_sum += Math.abs(x[j] - x[j + 2]);
                    curr_sum += Math.abs(y[j] - y[j + 2]);
                }
                else {
                    curr_sum += Math.abs(x[j] - x[j + 1]);
                    curr_sum += Math.abs(y[j] - y[j + 1]);
                }
            }
            if (curr_sum < min)
                min = curr_sum;
        }
        System.out.println(min);
    }
}