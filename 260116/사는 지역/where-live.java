import java.util.Scanner;
import java.util.Arrays;

class Person {
    String name, addr, city;

    public Person(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();

            persons[i] = new Person(names[i], addresses[i], regions[i]);
        }
        Arrays.sort(names);
        for (int i = 0; i < n; i ++) {
            if (names[names.length - 1].equals(persons[i].name)) {
                System.out.println("name " + persons[i].name);
                System.out.println("addr " + persons[i].addr);
                System.out.println("city " + persons[i].city);
            }
        }

        // Please write your code here.
    }
}