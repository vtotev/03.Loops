import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countDograma = Integer.parseInt(scan.nextLine());
        String typeDograma = scan.nextLine();
        String delivery = scan.nextLine();
        double singlePrice = 0.0;
        double totalPrice = 0.0;
        if (countDograma >= 10) {
            switch (typeDograma) {
                case "90X130":
                    singlePrice = 110.0;
                    if (countDograma > 30 && countDograma < 60) {
                        totalPrice = (singlePrice * countDograma) * 0.95;
                    } else if (countDograma > 60) {
                        totalPrice = (singlePrice * countDograma) * 0.92;
                    } else {totalPrice = singlePrice * countDograma; }
                    break;

                case "100X150":
                    singlePrice = 140.0;
                    if (countDograma > 40 && countDograma < 80) {
                        totalPrice = (singlePrice * countDograma) * 0.94;
                    } else if (countDograma > 80) {
                        totalPrice = (singlePrice * countDograma) * 0.9;
                    } else {totalPrice = singlePrice * countDograma; }
                    break;

                case "130X180":
                    singlePrice = 190.0;
                    if (countDograma > 20 && countDograma < 50) {
                        totalPrice = (singlePrice * countDograma) * 0.93;
                    } else if (countDograma > 50) {
                        totalPrice = (singlePrice * countDograma) * 0.88;
                    } else {totalPrice = singlePrice * countDograma; }
                    break;

                case "200X300":
                    singlePrice = 250.0;
                    if (countDograma > 25 && countDograma < 50) {
                        totalPrice = (singlePrice * countDograma) * 0.91;
                    } else if (countDograma > 50) {
                        totalPrice = (singlePrice * countDograma) * 0.86;
                    } else {totalPrice = singlePrice * countDograma; }
                    break;
            }
            if (delivery.equals("With delivery")) {
                    totalPrice += 60;
            }
            if (countDograma > 99) {
                totalPrice = totalPrice * 0.96;
            }
            System.out.printf("%.2f BGN", totalPrice);
        } else if (countDograma < 10) {
            System.out.println("Invalid order");
        }
    }
}
