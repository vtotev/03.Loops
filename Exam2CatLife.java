import java.util.Scanner;

public class Exam2CatLife {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String catBreed = scan.nextLine();
        String catSex = scan.nextLine();
        int catLife = 0;
        switch (catBreed) {
            case "British Shorthair":
                if (catSex.equals("m")) {
                    catLife = (13 * 12) / 6;
                } else if (catSex.equals("f")) {
                    catLife = (14 * 12) / 6;
                }
                System.out.printf("%d cat months", catLife);
                break;

            case "Siamese":
                if (catSex.equals("m")) {
                    catLife = (15 * 12) / 6;
                } else if (catSex.equals("f")) {
                    catLife = (16 * 12) / 6;
                }
                System.out.printf("%d cat months", catLife);
                break;

            case "Persian":
                if (catSex.equals("m")) {
                    catLife = (14 * 12) / 6;
                } else if (catSex.equals("f")) {
                    catLife = (15 * 12) / 6;
                }
                System.out.printf("%d cat months", catLife);
                break;

            case "Ragdoll":
                if (catSex.equals("m")) {
                    catLife = (16 * 12) / 6;
                } else if (catSex.equals("f")) {
                    catLife = (17 * 12) / 6;
                }
                System.out.printf("%d cat months", catLife);
                break;

            case "American Shorthair":
                if (catSex.equals("m")) {
                    catLife = (12 * 12) / 6;
                } else if (catSex.equals("f")) {
                    catLife = (13 * 12) / 6;
                }
                System.out.printf("%d cat months", catLife);
                break;

            case "Siberian":
                if (catSex.equals("m")) {
                    catLife = (11 * 12) / 6;
                } else if (catSex.equals("f")) {
                    catLife = (12 * 12) / 6;
                }
                System.out.printf("%d cat months", catLife);
                break;
            default:
                System.out.printf("%s is invalid cat!", catBreed);
                break;
        }
    }
}
