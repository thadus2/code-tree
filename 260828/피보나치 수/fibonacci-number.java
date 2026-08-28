import java.util.Scanner;

// 1. Memozation

// public class Main {
//     private static int[] memo = new int[46];
//     private static int fibo(int n) {
//         if (memo[n] != -1) {
//             return memo[n];
//         }
//         else if(n <= 2) {
//             memo[n] = 1;
//             return 1;
//         }
//         else {
//             memo[n] = fibo(n - 1) + fibo(n - 2);
//             return memo[n];
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         // Please write your code here.
//         for (int i = 0; i < 46; i++) {
//             memo[i] = -1;
//         }
//         System.out.println(fibo(n));
//     }
// }

// 2. Tabulation

public class Main {
    private static int[] dp;
    private static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[n + 1];
        dp[1] = 1; 
        if (n >= 2)
            dp[2] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
    }
}