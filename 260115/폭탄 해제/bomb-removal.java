import java.util.Scanner;

class ToDefuse {
    String uCode;
    char lColor;
    int time;

    public ToDefuse(String uCode, char lColor, int time) {
        this.uCode = uCode;
        this.lColor = lColor;
        this.time = time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        ToDefuse toDefuse = new ToDefuse(uCode, lColor, time);
        System.out.println("code : " + toDefuse.uCode);
        System.out.println("color : " + toDefuse.lColor);
        System.out.println("second : " + toDefuse.time);
    }
}