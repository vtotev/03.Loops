import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNum = -20000;
        int minNum = 20000;
        int count = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num < minNum) { minNum = num; }

            if (num > maxNum) { maxNum = num; }
        }
        System.out.printf("Max number: %d", maxNum);
        System.out.println();
        System.out.printf("Min number: %d", minNum);
    }
}
