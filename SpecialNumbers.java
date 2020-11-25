import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            int firstDigit = i / 1000;
            int secondDigit = i / 100 % 10;
            int thirdDigit = i / 10 % 10;
            int fourthDigit = i % 10;

            boolean check1 = firstDigit != 0 && N % firstDigit == 0;
            boolean check2 = secondDigit != 0 && N % secondDigit == 0;
            boolean check3 = thirdDigit != 0 && N % thirdDigit == 0;
            boolean check4 = fourthDigit != 0 && N % fourthDigit == 0;

            if (check1 && check2 && check3 && check4) {
                System.out.print(i + " ");
            }
        }
    }
}
