import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        String pass = scan.nextLine();
        String input = scan.nextLine();
        while (!input.equals(pass)) {
            input = scan.nextLine();
        }
        System.out.printf("Welcome %s!", user);
    }
}
