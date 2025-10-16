import java.util.Scanner;
public class Main {
    private static int calc(int a, char o, int b) {
        switch (o) {
            case '+':
                return (a + b);
            case '-':
                return (a - b);
            case '/':
                return (a / b);
            case '*':
                return (a * b);
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        if (calc(a,o,c) != 0)
            System.out.printf("%d %c %d = %d", a, o, c, calc(a,o,c));
        else 
        System.out.print("False");
    }
}