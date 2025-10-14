import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print((num % 9 + 1) + " ");
                num++;
            }
            System.out.println("");
        }
    }
}