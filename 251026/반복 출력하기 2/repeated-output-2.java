import java.util.Scanner;
public class Main {
    private static void printHelloWorld(int n) {
        if (n <= 0)
            return;
        System.out.println("HelloWorld");
        n--;
        printHelloWorld(n);            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printHelloWorld(n);
    }
}