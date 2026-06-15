import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        ArrayList<Integer> arr = new ArrayList<>();
        int input = 0;
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            switch (command) {
                case("push_back"):
                    input = sc.nextInt();
                    arr.add(input);
                    break;
                case("pop_back"):
                    arr.remove(arr.size() - 1);
                    break;
                case("size"):
                    System.out.println(arr.size());
                    break;
                case("get"):
                    input = sc.nextInt();
                    System.out.println(arr.get(input - 1));
                    break;
            }
        }
    }
}