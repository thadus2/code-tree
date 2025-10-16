import java.util.Scanner;
public class Main {
    private static int isPerfect(int a, int b) {
        int cnt = 0;
        for (int i = a; i < b + 1; i++) {
            if (i % 2 == 0)
                continue;
            if (i % 10 == 5)
                continue;
            if (i % 3 == 0 && i % 9 != 0)
                continue;
            cnt += 1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(isPerfect(A, B));
    }
}