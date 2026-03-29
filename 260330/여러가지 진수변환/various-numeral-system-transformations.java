import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int[] num = new int[20];
        int cnt = 0;
        while(true) {
            if(n < b) {
                num[cnt++] = n;
                break;
            }
            num[cnt++] = n % b;
            n /= b;
        }

        for (int i = cnt - 1; i >= 0; i--) 
            System.out.print(num[i]);
    }
}