import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        char[] arr = a.toCharArray();
        boolean flag = true;

        for (int i = 0; i < a.length(); i++) {
            if (arr[i] == '0') {
                arr[i] = '1';
                flag = false;
                break;
            }    
        }
        if (flag)
            arr[a.length() - 1] = '0';

        int result = Integer.parseInt(String.valueOf(arr), 2);
        
        System.out.println(result);
    }
}