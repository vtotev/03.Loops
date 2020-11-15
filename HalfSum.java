import jdk.jfr.Percentage;

import java.util.Scanner;

public class HalfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num > maxNum) {
                maxNum = num;
            }
            sum += num;
        }
        int sumWithoutMax = sum - maxNum;
        if (maxNum == sumWithoutMax) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        }
        else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNum - sumWithoutMax));
        }
    }
}
