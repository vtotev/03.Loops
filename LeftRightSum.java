import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int leftSum = 0;
        int rightNum = 0;
        int count = Integer.parseInt(scan.nextLine());
        for (int l = 1; l <= count; l++) {
            int lNum = Integer.parseInt(scan.nextLine());
            leftSum += lNum;
        }
        for (int r = count; r < count*2; r++) {
            int rNum = Integer.parseInt(scan.nextLine());
            rightNum += rNum;
        }

        if (leftSum == rightNum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else System.out.printf("No, diff = %d", Math.abs((leftSum - rightNum)));
    }
}
