import java.util.Scanner;

public class ExamBarcodeGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNum = Integer.parseInt(scan.nextLine());
        int endNum = Integer.parseInt(scan.nextLine());

        int firstDigit1 = startNum / 1000;
        int secondDigit1 = startNum / 100 % 10;
        int thirdDigit1 = startNum / 10 %10;
        int fourthDigit1 = startNum % 10;

        int firstDigit2= endNum / 1000;
        int secondDigit2 = endNum / 100 % 10;
        int thirdDigit2 = endNum / 10 %10;
        int fourthDigit2 = endNum % 10;


        for (int fir = firstDigit1; fir <= firstDigit2; fir++) {
            for (int sec = secondDigit1; sec <= secondDigit2; sec++) {
                for (int thir = thirdDigit1; thir <= thirdDigit2; thir++) {
                    for (int four = fourthDigit1; four <= fourthDigit2; four++) {
                        boolean firstOdd = fir % 2 != 0;
                        boolean secondOdd = sec % 2 != 0;
                        boolean thirdOdd = thir % 2 != 0;
                        boolean fourthOdd = four % 2 != 0;

                        if (firstOdd && secondOdd && thirdOdd && fourthOdd) {
                            System.out.printf("%d%d%d%d ", fir, sec, thir, four);
                        }

                    }
                }
            }


        }
    }
}
