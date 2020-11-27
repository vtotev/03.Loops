import java.sql.Timestamp;
import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String studentName = scan.nextLine();
        int grade = 1;
        double sum = 0.0;
        int repetitions = 0;
        while (grade <= 12) {
            double currentMark = Double.parseDouble(scan.nextLine());
            if (currentMark < 4) {
                repetitions++;
                if (repetitions == 2) {
                    System.out.printf("%s has been excluded at %d grade", studentName, grade);
                    break;
                }
                continue;
            }

            sum += currentMark;
            grade++;
        }
        if (repetitions != 2) {
            double averageMark = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageMark);
        }
    }

}
