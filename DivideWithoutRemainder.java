import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int count = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= count; i++) {
            int numb = Integer.parseInt(scan.nextLine());
            if (numb % 2 == 0) { p1 += 1; }
            if (numb % 3 == 0) { p2 += 1; }
            if (numb % 4 == 0) { p3 += 1; }
        }
        double percP1 = (p1 * 1.00) / count * 100;
        double percP2 = (p2 * 1.00) / count * 100;
        double percP3 = (p3 * 1.00) / count * 100;

        System.out.printf("%.2f%%", percP1);
        System.out.println();
        System.out.printf("%.2f%%", percP2);
        System.out.println();
        System.out.printf("%.2f%%", percP3);
    }
}
