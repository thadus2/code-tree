import java.util.Scanner;

public class Main {
    private static int sum(int n) {
        if (n == 0)
            return 0;
        int sum = 0;
        return ((sum + n) + sum(n - 1));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(sum(n));
    }
}