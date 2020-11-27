import jdk.jfr.Percentage;

import java.util.Scanner;

public class ReadWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            System.out.println(input);
            input = scan.nextLine();
        }
    }
}
