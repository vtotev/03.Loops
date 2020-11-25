import java.util.Scanner;

public class ExamBestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inp = "";
        int goals = 0;

        String bestPlayer = "";
        int bestPlayerGoals = 0;

        while (!inp.equals("END")) {
            inp = scan.nextLine();
            if (!inp.equals("END")) {
                goals = Integer.parseInt(scan.nextLine());
                if (goals > bestPlayerGoals) {
                    bestPlayerGoals = goals;
                    bestPlayer = inp;
                }
                if (goals >= 10) {
                    break;
                }
            }
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (bestPlayerGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n",  bestPlayerGoals);
        } else {
            System.out.printf("He has scored %d goals.%n", bestPlayerGoals);
        }
    }
}
