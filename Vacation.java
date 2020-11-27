import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyNeed = Double.parseDouble(scan.nextLine());
        double moneyHave = Double.parseDouble(scan.nextLine());
        int daysCounter = 0;
        int daysSoent = 0;
        while (moneyHave < moneyNeed && daysSoent < 5) {
            String action = scan.nextLine();
            double moneySpend = Double.parseDouble(scan.nextLine());
            daysCounter++;
            switch (action) {
                case "spend":
                    moneyHave -= moneySpend;
                    daysSoent++;
                    if (moneyHave < 0) {
                        moneyHave = 0.0;
                    }
                    break;
                case "save":
                    moneyHave += moneySpend;
                    daysSoent = 0;
                    break;
            }
        }

        if (daysSoent == 5) {
            System.out.printf("You can't save the money.%n%d", daysCounter);
        }

        if (moneyHave >= moneyNeed) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}
