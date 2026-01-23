import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] binary = new int[20];
        int position = 0;
        while(n > 0) {
            binary[position++] = n % 2;
            n /= 2;
        }
        for (int i = --position; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}