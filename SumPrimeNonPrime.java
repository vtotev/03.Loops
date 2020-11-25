import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String imp = scan.nextLine();
        int primeNums = 0;
        int nonPrime = 0;
        int number = 0;
        int count = 0;
        while (!imp.equals("stop")) {
            number = Integer.parseInt(imp);
            if (number < 0) {
                System.out.println("Number is negative.");
            } else
            {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    primeNums += number;
                } else nonPrime += number;
                count = 0;
            }
            imp = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d", primeNums);
        System.out.println();
        System.out.printf("Sum of all non prime numbers is: %d", nonPrime);
    }
}
