import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPersons = new int[n + 1];
        int penalizedPerson;
        for (int i = 0; i < m; i++) {
            penalizedPerson = sc.nextInt();
            penalizedPersons[penalizedPerson]++;
        }
        // Please write your code here.
        for (int i = 1; i < n + 1; i++) {
            if (penalizedPersons[i] >= k)
                System.out.println(i);
        }
    }
}