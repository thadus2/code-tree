import java.util.Scanner;
public class Main {
    private static int calc(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + calc(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(calc(a*b*c));
        // Please write your code here.
    }
}