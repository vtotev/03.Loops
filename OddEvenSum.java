import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int evenSum = 0;
        int OddSum = 0;
        int count = Integer.parseInt(scan.nextLine());
        for (int l = 1; l <= count; l++) {
            int Num = Integer.parseInt(scan.nextLine());
            if (l % 2 == 0) {
                evenSum += Num;
            } else {OddSum += Num; }
        }

        if (evenSum == OddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(evenSum - OddSum));
        }

    }
}
