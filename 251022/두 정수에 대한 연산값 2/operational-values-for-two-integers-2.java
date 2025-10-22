import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}
public class Main {
    private static void func(IntWrapper a, IntWrapper b) {
        if (a.value < b.value) {
            a.value += 10;
            b.value *= 2;
        }
        else {
            a.value *= 2;
            b.value += 10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());
        // Please write your code here.
        func(a, b);
        System.out.println(a.value + " " + b.value);
    }
}