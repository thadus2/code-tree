import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            result = result * 2 + (binary.charAt(i) - '0');
        }

        result *= 17;

        int[] binary2 = new int[20];
        int position = 0;
        while(result > 0) {
            binary2[position++] = result % 2;
            result /= 2;
        }
        for (int i = --position; i >= 0; i--) {
            System.out.print(binary2[i]);
        }
        
    }
}