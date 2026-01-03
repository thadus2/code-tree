import java.util.Scanner;

public class Main {
    public static int calc(int n) {
        if (n <= 1) {
            return n;
        }
        return n + calc(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(calc(n));
    }
}