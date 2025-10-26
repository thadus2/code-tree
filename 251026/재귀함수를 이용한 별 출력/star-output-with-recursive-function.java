import java.util.Scanner;
public class Main {
    private static void printStar(int n) {
        if (n == 0)
            return;
        n--;
        printStar(n);
        for (int i = 0; i < (n + 1); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printStar(n);
    }
}