import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double sum = 0;
        while (!input.equals("NoMoreMoney")) {
            if (!input.equals("NoMoreMoney")) {
            double numb = Double.parseDouble(input);
            if (numb >= 0) {
                sum += numb;
                System.out.printf("Increase: %.2f", numb);
                System.out.println();
                }
            else {
                System.out.println("Invalid operation!");
                break;
            }
                input = scan.nextLine();
            }
        }
        System.out.printf("Total: %.2f", sum);
    }
}
