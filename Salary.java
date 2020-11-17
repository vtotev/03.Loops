import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int openTabs = Integer.parseInt(scan.nextLine());
        int Salary = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= openTabs; i++) {
            String site = scan.nextLine();
            switch (site) {
                case "Facebook": Salary -= 150; break;
                case "Instagram": Salary -= 100; break;
                case "Reddit": Salary -= 50; break;
            }
            if (Salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (Salary > 0) {
            System.out.println(Salary);
        }

    }
}
