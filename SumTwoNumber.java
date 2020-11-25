import java.util.Scanner;

public class SumTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());
        int counter = 0;
        int combo = 0;
        for (int x = num1; x <= num2; x++) {
            for (int y = num1; y <= num2; y++) {
                combo = x + y;
                counter++;
                if (combo == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, x, y, magicNum);
                    break;
                }
                if (combo == magicNum) {
                    break;
                }
            }
            if (combo == magicNum) {
                break;
            }
        }
        if (combo != magicNum) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
