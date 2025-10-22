import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}
public class Main {
    private static void func(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        }
        else {
            a.value *= 2;
            b.value += 25;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        IntWrapper aVal = new IntWrapper(a);
        IntWrapper bVal = new IntWrapper(b);

        func(aVal, bVal);

        System.out.println(aVal.value + " " + bVal.value);
    }
}