import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        // Please write your code here.
        int min = 9999;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int curr_sum = Math.abs(s - (sum - arr[i] - arr[j]));
                if (min > curr_sum)
                    min = curr_sum;
            }
        }
        System.out.println(min);
    }
}