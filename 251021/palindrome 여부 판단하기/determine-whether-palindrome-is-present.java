import java.util.Scanner;
public class Main {
    private static String reverseString(String s) {
        String ret = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ret += s.charAt(i);
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        String reverseInput = "";
        reverseInput = reverseString(input);
        if (input.equals(reverseInput))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}