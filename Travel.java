import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        double sum = 0;
        while (!inp.equals("End")) {
            double budget = Double.parseDouble(scan.nextLine());
            while (sum < budget) {
                sum += Double.parseDouble(scan.nextLine());
            }
            System.out.printf("Going to %s!%n", inp);
            sum = 0;
            inp = scan.nextLine();
            if (inp.equals("End")) {
                break;
            }
        }
    }
}
