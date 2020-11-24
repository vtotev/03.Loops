import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());

        for (int i = floors; i > 0; i--) {
            if (i == floors) {
                for (int f = 0; f < rooms; f++) {
                    System.out.printf("L%d%d ", i, f);
                }
            } else if (i % 2 ==0) {
                for (int n = 0; n < rooms; n++) {
                    System.out.printf("O%d%d ", i, n);
                }
            }
           else if (i % 2 != 0) {
            for (int n = 0; n < rooms; n++) {
                System.out.printf("A%d%d ", i, n);
            }
        }
        System.out.println();
        }
    }
}
