import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jury = Integer.parseInt(scan.nextLine());
        double ocenka = 0.0;
        double finalScore = 0.0;
        int count = 0;
        String name = scan.nextLine();
        while (!name.equals("Finish")) {
            for (int i = 1; i <= jury; i++) {
                ocenka += Double.parseDouble(scan.nextLine());
            }
            finalScore += ocenka / jury;
            count++;
            System.out.printf("%s - %.2f.", name, ocenka / jury);
            System.out.println();
            name = scan.nextLine();
            ocenka = 0.0;
        }
        System.out.printf("Student's final assessment is %.2f.", finalScore / (count));
    }
}
