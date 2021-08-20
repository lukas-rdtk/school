import java.util.ArrayList;
import java.util.Scanner;

public class LoginViaPin {
    public LoginViaPin() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        list.add(456);
        list.add(567);
        list.add(678);
        list.add(789);
        Scanner scanner = new Scanner(System.in, "iso-8859-1");
        int zahl = Integer.parseInt(scanner.nextLine());
        if (list.contains(zahl)) {
            System.out.println("Login erfolgreich");
        } else {
            System.out.println("Login verweigert");
        }

    }
}
