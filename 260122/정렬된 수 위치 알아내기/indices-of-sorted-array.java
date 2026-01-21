import java.util.Scanner;
import java.util.Arrays;

class MyArray implements Comparable<MyArray> {
    int num, position;

    public MyArray(int num, int position) {
        this.num = num;
        this.position = position;
    }

    @Override
    public int compareTo(MyArray arr) {
        return this.num - arr.num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        MyArray[] arrs = new MyArray[n];
        int num;
        for(int i = 0; i < n; i++){
            num = sc.nextInt();
            arrs[i] = new MyArray(num, (i + 1));
            arr[i] = num;
        }
        // Please write your code here.

        Arrays.sort(arrs);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arrs[j].num == arr[i]) {
                    arrs[j].num = 0;
                    System.out.print((j + 1) + " ");
                    break;
                }
            }
        }
    }
}