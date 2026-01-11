import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        char[] chars1 = word1.toCharArray();
        String word2 = sc.next();
        char[] chars2 = word2.toCharArray();
        // Please write your code here.
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        
        if (word1.length() != word2.length()) {
            System.out.println("No");
            return;
        }

        boolean flag = true;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                flag = false;
                break;
            }
        }  
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}