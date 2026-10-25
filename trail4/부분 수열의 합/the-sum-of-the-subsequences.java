import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] dp = new int[m + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 0; j--) {
                if ((j - arr[i] >= 0) && (dp[j - arr[i]] != 0)) {
                    if (dp[j] == 0) {
                        dp[j] = dp[j - arr[i]] + 1;
                    }
                    else {
                        dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
                    }

                }
            }
        }
        if (dp[m] == 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}