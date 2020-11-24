import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        for (int num = first; num <= second; num++) {
            int firstDig = num / 100000;
            int secondDig = num / 10000 % 10;
            int thirdDig = num / 1000 % 10;
            int fourthDig = num / 100 % 10;
            int fifthDig = num / 10 % 10;
            int sixtDig = num % 10;
            int sumEven = secondDig + fourthDig + sixtDig;
            int sumOdd = firstDig + thirdDig + fifthDig;
            if (sumEven == sumOdd) {
                System.out.print(num + " ");
            }
        }
    }
}
