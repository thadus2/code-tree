import java.util.Scanner;
public class Main {
    private static int calcForOne(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) 
            return calcForOne(n / 2) + 1;
        else
            return calcForOne(n * 3 + 1) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calcForOne(n));
        // Please write your code here.
    }
}