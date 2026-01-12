import java.util.Scanner;
class Secret {
        String sCode;
        char mPoint;
        int time;

        public Secret(String sCode, char mPoint, int time) {
            this.sCode = sCode;
            this.mPoint = mPoint;
            this.time = time;
        }
    }
public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();   
        char mPoint = sc.next().charAt(0); 
        int time = sc.nextInt(); 
        Secret secret1 = new Secret(sCode, mPoint, time);

        System.out.println("secret code : " + secret1.sCode);
        System.out.println("meeting point : " + secret1.mPoint);
        System.out.println("time : " + secret1.time);
        // Please write your code here.
    }
}