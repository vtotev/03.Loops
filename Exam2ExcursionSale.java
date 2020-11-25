import java.util.Scanner;

public class Exam2ExcursionSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seaN = Integer.parseInt(scan.nextLine());
        int mountainN = Integer.parseInt(scan.nextLine());

        int seaCount = 0;
        int mountainCount = 0;
        String typeReaded = scan.nextLine();
        while (!typeReaded.equals("Stop")) {
            switch (typeReaded) {
                case "sea":
                    if (seaCount < seaN) {
                        seaCount++;
                    }
                    break;

                case "mountain":
                    if (mountainCount < mountainN) {
                        mountainCount++;
                    }
                    break;
            }
            if (seaCount == seaN && mountainCount == mountainN) {
                break;
            }
            typeReaded = scan.nextLine();
        }
        if (seaCount == seaN && mountainCount == mountainN) {
            System.out.println("Good job! Everything is sold.");
        }
        int profit = (seaCount * 680) + (mountainCount * 499);
        System.out.printf("Profit: %d leva.", profit);
    }
}
