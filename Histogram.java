import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= count; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number < 200) { p1 += 1; }
            else if (number >= 200 && number <= 399) { p2 += 1; }
            else if (number >= 300 && number <= 599) { p3 += 1; }
            else if (number >= 600 && number <= 799) { p4 += 1; }
            else if (number >= 800) { p5 += 1; }
        }
        double percentP1 = (p1 * 1.00) / count * 100;
        double percentP2 = (p2 * 1.00) / count * 100;
        double percentP3 = (p3 * 1.00) / count * 100;
        double percentP4 = (p4 * 1.00) / count * 100;
        double percentP5 = (p5 * 1.00) / count * 100;

        System.out.printf("%.2f%%", percentP1);
        System.out.println();
        System.out.printf("%.2f%%", percentP2);
        System.out.println();
        System.out.printf("%.2f%%", percentP3);
        System.out.println();
        System.out.printf("%.2f%%", percentP4);
        System.out.println();
        System.out.printf("%.2f%%", percentP5);
    }
}
