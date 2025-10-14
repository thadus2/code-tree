import java.util.Scanner;
public class Main {
    public static boolean isTrue(int n) { 
        while (n != 0) {
            if ((n % 10) % 3 == 0) {
                return true;                
            }
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
        for (int i = A; i < (B + 1); i++) {
            if (i % 3 == 0 || ((i % 10 != 0 && isTrue(i))))
                sum += 1;
        }
        System.out.println(sum);
    }
}