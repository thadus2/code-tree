import java.util.Scanner;
public class Main {
    private static boolean func(String s) {
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        if (func(A))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}