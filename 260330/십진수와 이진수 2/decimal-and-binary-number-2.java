import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int dec = 0;
        for (int i = 0; i < binary.length(); i++) {
            dec = dec * 2 + (binary.charAt(i) - '0');
        }
        dec *= 17;

        int bin[] = new int[20];
        int cnt = 0;
        while (true) {
            if (dec < 2) {
                bin[cnt++] = dec;
                break;
            }
            bin[cnt++] = dec % 2;
            dec /= 2;
        }

        for (int i = cnt - 1; i >= 0; i--)
            System.out.print(bin[i]);
    }
}