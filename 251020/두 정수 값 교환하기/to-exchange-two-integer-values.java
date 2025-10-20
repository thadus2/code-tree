import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}
public class Main {
    private static void swap (IntWrapper n, IntWrapper m) {
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nVal = sc.nextInt();
        int mVal = sc.nextInt();
        // Please write your code here.
        IntWrapper n = new IntWrapper(nVal);
        IntWrapper m = new IntWrapper(mVal);

        swap(n, m);

        System.out.println(n.value + " " + m.value);
    }
}