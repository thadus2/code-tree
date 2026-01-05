import java.util.Scanner;
public class Main {
    private static int nums(int n) {
        if (n <= 2) {
            return 2 * n;
        }
        return (nums(n - 1) * nums(n - 2) % 100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nums(n));
        // Please write your code here.
    }
}