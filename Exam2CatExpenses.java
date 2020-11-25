import java.util.Scanner;

public class Exam2CatExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bedPrice = Double.parseDouble(scan.nextLine());
        double toiletPerMonth = Double.parseDouble(scan.nextLine());

        double food = toiletPerMonth * 1.25;
        double toys = food / 2;
        double vet = toys * 1.1;

        double totalExp = toiletPerMonth + food + toys + vet;
        double nonPlannedExp = totalExp * 0.05;

        totalExp = bedPrice + ((totalExp + nonPlannedExp) * 12);

        System.out.printf("%.2f lv.", totalExp);
    }
}
