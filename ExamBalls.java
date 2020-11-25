import java.util.Scanner;

public class ExamBalls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balls = Integer.parseInt(scan.nextLine());
        int redcount = 0;
        int orangecount = 0;
        int yellowcount = 0;
        int whitecount = 0;
        int blackcount = 0;
        int totalPoint = 0;
        int otheCount = 0;
        for (int i = 1; i <= balls; i++) {
            String ballType = scan.nextLine();
            switch (ballType) {
                case "red":
                    totalPoint += 5;
                    redcount++;
                    break;

                case "orange":
                    totalPoint += 10;
                    orangecount++;
                    break;

                case "yellow":
                    totalPoint += 15;
                    yellowcount++;
                    break;

                case "white":
                    totalPoint += 20;
                    whitecount++;
                    break;

                case "black":
                    if (totalPoint > 0) {
                        totalPoint = totalPoint / 2;
                    }
                    blackcount++;
                    break;
                default: otheCount++; break;
            }
        }
        System.out.printf("Total points: %d%n", totalPoint);
        System.out.printf("Points from red balls: %d%n", redcount);
        System.out.printf("Points from orange balls: %d%n", orangecount);
        System.out.printf("Points from yellow balls: %d%n", yellowcount);
        System.out.printf("Points from white balls: %d%n", whitecount);
        System.out.printf("Other colors picked: %d%n", otheCount);
        System.out.printf("Divides from black balls: %d", blackcount);
    }
}
