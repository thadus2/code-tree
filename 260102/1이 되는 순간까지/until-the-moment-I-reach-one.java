import java.util.Scanner;

public class Main {
    private static int cnt = 0;
    private static void func(int n) {
        if (n == 1) {
            System.out.println(cnt);
            return;
        }
        else if (n % 2 == 0) {
            cnt += 1;
            func(n / 2);
        }
        else {
            cnt += 1;
            func(n / 3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        func(n);
    }
}