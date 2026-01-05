import java.util.Scanner;
public class Main {
    private static int strangeArr(int n) {
        if (n <= 2)
            return n;
        return strangeArr(n/3) + strangeArr(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(strangeArr(n));
        // Please write your code here.
    }
}