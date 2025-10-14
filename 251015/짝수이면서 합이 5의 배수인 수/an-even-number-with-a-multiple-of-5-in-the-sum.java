import java.util.Scanner;
public class Main {
        public static boolean isTrue(int n) {
            int sum = 0;
            int temp = n;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            return ((n % 2 == 0) && (sum % 5 == 0));
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        boolean a = isTrue(n);
        if (a)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}