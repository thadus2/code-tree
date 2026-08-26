import java.util.Scanner;
public class Main {
    private static int[] memo = new int[46];
    private static int fibo(int n) {
        if (memo[n] != -1) {
            return memo[n];
        }
        else if(n <= 2) {
            memo[n] = 1;
            return 1;
        }
        else {
            memo[n] = fibo(n - 1) + fibo(n - 2);
            return memo[n];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        for (int i = 0; i < 46; i++) {
            memo[i] = -1;
        }
        System.out.println(fibo(n));
    }
}