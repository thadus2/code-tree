import java.util.Scanner;
public class Main {
    private static boolean isPart(int a[], int b[], int n1, int n2) {
        boolean flag = true;
        for (int i = 0; i < n1 - n2 + 1; i++) {
            flag = true;
            for (int j = 0; j < n2; j++) {
                if (a[i + j] != b[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return flag;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        if (isPart(a, b, n1, n2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}