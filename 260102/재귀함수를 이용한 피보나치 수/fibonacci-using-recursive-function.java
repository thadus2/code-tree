import java.util.Scanner;

public class Main {
    private static int fiv(int n){
        if (n == 1) 
            return 1;
        if (n == 2)
            return 1;
        return fiv(n - 2) + fiv(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fiv(n));
    }
}