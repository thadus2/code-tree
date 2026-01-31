import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();

        int decimal = 0;
        for (int i = 0; i < N.length(); i++) {
            decimal = decimal * A + (N.charAt(i) - '0');
        }

        if (decimal == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % B);
            decimal /= B;
        }

        System.out.println(sb.reverse().toString());
    }
}
