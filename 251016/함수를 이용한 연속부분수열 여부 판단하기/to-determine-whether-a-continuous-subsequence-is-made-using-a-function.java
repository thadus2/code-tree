import java.util.Scanner;
public class Main {
    private static String isPart(int a[], int b[], int n1, int n2) {
        int cnt = 0;
        for (int i = 0; i < n1 - n2 + 1; i++) {
            for (int j = 0; j < n2; j++) {
                if (a[i + j] != b[j]) {
                    cnt = 0;
                    break;
                }
                cnt += 1;
            }
            if (cnt == n2)
                return "Yes";
        }
        return "No";
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
        System.out.println(isPart(a, b, n1, n2));
    }
}