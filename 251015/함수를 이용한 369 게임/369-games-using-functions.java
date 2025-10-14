import java.util.Scanner;
public class Main {
    private static boolean isTrue(int n) {
        while (n != 0) {
            int temp = n % 10;
            if ((temp != 0) && (temp % 3 == 0))
                return true;
            n /= 10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int sum = 0;
        for (int i = A; i < B + 1; i ++) {
            if ((i % 3 == 0) || isTrue(i))
                sum += 1;
        }
        System.out.println(sum);
    }
}