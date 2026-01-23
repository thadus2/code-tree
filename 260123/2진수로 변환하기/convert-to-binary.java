import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[] binary = new int[20];
        int position = 0;
        while(n >= 1) {
            binary[position++] = n % 2;
            n /= 2;
        }
        for (int i = --position; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}