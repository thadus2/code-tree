import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = -1;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int n1 = arr[i];
                    int n2 = arr[j];
                    int n3 = arr[k];
                    int pre_sum = n1 + n2 + n3;
                    while (true) {      
                        // System.out.println(n1+ " " + n2 + " " + n3);    
                        // System.out.println(pre_sum + " " + (n1 % 10 + n2 % 10 + n3 % 10));              
                        if ((n1 % 10 + n2 % 10 + n3 % 10) >= 10)
                            break;
                        n1 /= 10; n2 /= 10; n3 /= 10;
                        if (n1 == 0 && n2 == 0 && n3 == 0) {
                            if (max < pre_sum)
                                max = pre_sum;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}