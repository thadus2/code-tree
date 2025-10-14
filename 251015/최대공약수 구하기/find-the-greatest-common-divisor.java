import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 1;
        int max = 0;
        // Please write your code here.
        for (; i < n || i < m; i++ ) {
            if (n % i == 0 && m % i == 0) {
                max = i;
            }
        }
        System.out.println(max);
    }
}