import java.util.Scanner;
public class Main {
    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    private static int condDisc(int a,int b) {
        int cnt = 0;
        for (int i = a; i < b + 1; i++) {
            if (isPrime(i)) {
                int temp = i;
                int sum = 0;
                while (temp != 0) {
                    sum += (temp % 10);
                    temp /= 10;
                }
                if (sum % 2 == 0) {
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(condDisc(a, b));
    }
}