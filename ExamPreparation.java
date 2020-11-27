import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int badScores = Integer.parseInt(scan.nextLine());
        int bads = 0;
        boolean isFailed = false;
        int count = 0;
        double avg = 0.0;
        int score = 0;
        String input = "";
        String last = "";
        while (!input.equals("Enough")) {
            input = scan.nextLine();
            if (!input.equals("Enough")) {
                last = input;
            } else {
                break;
            }
            score = Integer.parseInt(scan.nextLine());
            if (score <= 4) {
                bads++;
            }
            if (bads >= badScores) {
                isFailed = true;
                break;
            }
            avg += score;
            count++;
        }
        if (!isFailed) {
            if (input.equals("Enough")) {
                double avgScore = avg / count;
                System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", avgScore, count, last);
            }
        } else System.out.printf("You need a break, %d poor grades.", bads);
    }
}
