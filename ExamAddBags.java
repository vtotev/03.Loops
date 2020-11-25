import java.util.Scanner;

public class ExamAddBags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceOverload = Double.parseDouble(scan.nextLine());
        double weightLuggage = Double.parseDouble(scan.nextLine());
        int daysToTrip = Integer.parseInt(scan.nextLine());
        int countLuggages = Integer.parseInt(scan.nextLine());
        int percentLuggage = 0;
        if (weightLuggage < 10) {
            percentLuggage = 5;
        } else if (weightLuggage >=10 && weightLuggage <= 20) {
            percentLuggage = 2;
        } else if (weightLuggage > 20) {
            percentLuggage = 1;
        }
        double luggagePrice = priceOverload / percentLuggage;
        if (daysToTrip < 7) {
            luggagePrice = luggagePrice * 1.4;
        } else if (daysToTrip >= 7 && daysToTrip <= 30) {
            luggagePrice = luggagePrice * 1.15;
        } else if (daysToTrip > 30) {
            luggagePrice = luggagePrice * 1.1;
        }
        luggagePrice = luggagePrice * countLuggages;
        System.out.printf("The total price of bags is: %.2f lv.", luggagePrice);
    }
}
