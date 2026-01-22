import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int d, h, m;
        d = 11;
        h = 11;
        m = 11;
        // Please write your code here.
        if (C < 11) {
            B--;
            C += 60;
        }
        C -= m;
        if (B < 11) {
            A--;
            B += 24;
        }
        B -= h;
        if (A < 11) {
            System.out.println(-1);
            return;
        }
        A -= d;
        System.out.println((A * 24 * 60) + (B * 60) + C);
    }
}