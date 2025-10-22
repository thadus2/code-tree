import java.util.Scanner;
public class Main {
    private static int isPartIndex(String s, String p) {
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            if (s.charAt(i) == p.charAt(0)) {
                for (int j = 1; j < p.length(); j++) {
                    if (s.charAt(i + 1) != p.charAt(j))
                        flag = false;
                }
            }
            else 
                flag = false;
            if (flag) 
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        System.out.println(isPartIndex(text, pattern));
    }
}