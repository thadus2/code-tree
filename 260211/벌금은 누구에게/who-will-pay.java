import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPersons = new int[n + 1];
        int penalizedPerson;
        int firstPenalize = -1;
        for (int i = 0; i < m; i++) {
            penalizedPerson = sc.nextInt();
            penalizedPersons[penalizedPerson]++;
            if (penalizedPersons[penalizedPerson] >= k && firstPenalize == -1) {
                firstPenalize = penalizedPerson;
            }
        }
        // Please write your code here.
        System.out.println(firstPenalize);
    }
}