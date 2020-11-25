import java.util.Scanner;

public class Exam2CatShirt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sizeRakav = Double.parseDouble(scan.nextLine());
        double sizeFront = Double.parseDouble(scan.nextLine());
        String typeMaterial = scan.nextLine();
        String withTie = scan.nextLine();
        double shirtSize = ((sizeFront + sizeRakav) * 0.02) * 1.1;

        double priceTotal = 0.00;

        switch (typeMaterial) {
            case "Linen":
               priceTotal = (shirtSize * 15) + 10;
               break;
            case "Cotton":
                priceTotal = (shirtSize * 12) + 10;
                break;
            case "Denim":
                priceTotal = (shirtSize * 20) + 10;
                break;
            case "Twill":
                priceTotal = (shirtSize * 16) + 10;
                break;
            case "Flannel":
                priceTotal = (shirtSize * 11) + 10;
                break;
        }
        if (withTie.equals("Yes")) {
            priceTotal = priceTotal * 1.2;
        }
        System.out.printf("The price of the shirt is: %.2flv.", priceTotal);
    }
}
