import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double min = 1000000;
        double max = -1000000;
        double OddSum = 0;
        double OddMin = min;
        double OddMax = max;

        double EvenSum = 0;
        double EvenMin = min;
        double EvenMax = max;
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                if (number > EvenMax) { EvenMax = number; }
                if (number < EvenMin) { EvenMin = number; }
                EvenSum += number;
            } else {
                if (number > OddMax) { OddMax = number; }
                if (number < OddMin) { OddMin = number; }
                OddSum += number;
            }
        }
        if (OddMax == max && OddMin == min) {
            OddSum = 0;
            System.out.printf("OddSum=%.2f,", OddSum);
            System.out.println();
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddSum=%.2f,", OddSum);
            System.out.println();
            System.out.printf("OddMin=%.2f,", OddMin);
            System.out.println();
            System.out.printf("OddMax=%.2f,", OddMax);
            System.out.println();
        }

        if (EvenMax == max && EvenMin == min) {
            EvenSum = 0;
            System.out.printf("EvenSum=%.2f,", EvenSum);
            System.out.println();
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenSum=%.2f,", EvenSum);
            System.out.println();
            System.out.printf("EvenMin=%.2f,", EvenMin);
            System.out.println();
            System.out.printf("EvenMax=%.2f", EvenMax);
            System.out.println();
        }

    }
}
