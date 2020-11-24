import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String companyName = scan.nextLine();
        int ticketsAdult = Integer.parseInt(scan.nextLine());
        int ticketsKid = Integer.parseInt(scan.nextLine());
        double ticketPrice = Double.parseDouble(scan.nextLine());
        double taksaObslujvane = Double.parseDouble(scan.nextLine());

        double ticketKidprice = 0.3 * ticketPrice;

        double priceWithAd = ticketPrice + taksaObslujvane;
        double priceKidWithAd = ticketKidprice + taksaObslujvane;

        double profitAdult = priceWithAd * ticketsAdult;
        double profitKids = priceKidWithAd * ticketsKid;

        double totalProfit = (profitAdult + profitKids) * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, totalProfit);
    }
}
