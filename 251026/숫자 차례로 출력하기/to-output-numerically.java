import java.util.Scanner;
public class Main {
    private static void printNumRev(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        n--;
        printNumRev(n);
    }
    private static void printNum(int n) {
        if (n == 0)
            return;
        n--;
        printNum(n);
        System.out.print((n + 1) + " ");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printNum(n);
        System.out.println();
        printNumRev(n);
    }
}