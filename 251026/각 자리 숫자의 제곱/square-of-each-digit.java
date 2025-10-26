import java.util.Scanner;
public class Main {
    private static int sumPow(int n) {
        if (n < 10)
            return (int)Math.pow(n, 2);
        int sum = 0;
        return ((sum + (int)Math.pow(n % 10, 2)) + sumPow(n / 10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(sumPow(n));
    }
}