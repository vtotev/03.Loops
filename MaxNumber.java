import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNumb = -200000;
        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            if (!input.equals("Stop")) {
                int numb = Integer.parseInt(input);
                if (numb > maxNumb) {
                    maxNumb = numb;
                }
                input = scan.next();
            }
        }
        System.out.println(maxNumb);
    }
}
