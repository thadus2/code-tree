import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int temp;
        while (m != 0) {
            temp = n % m;
            n = m;
            m = temp;
        }
        System.out.println(n);
    }
}