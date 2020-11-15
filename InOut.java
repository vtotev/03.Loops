import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        for (int i = 0; i < inp.length(); i++) {
            System.out.println(inp.charAt(i));
        }
    }
}
