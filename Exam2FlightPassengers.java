import java.util.Scanner;

public class Exam2FlightPassengers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int avioCompanies = Integer.parseInt(scan.nextLine());

//        int mostPassengers = 0;
//        int mostPassengersCount = 0;
        String mostPassCompany = "";
        double mostPass = 0.0;
        double passAvg = 0.0;
        if (avioCompanies >= 1 && avioCompanies <= 20) {
            for (int i = 1; i <= avioCompanies; i++) {
                int count = 0;
                int passWithAdd = 0;
                String companyName = scan.nextLine();
                String passengers = ""; //scan.nextLine();
                while (!passengers.equals("Finish")) {
                    passengers = scan.nextLine();
                    if (!passengers.equals("Finish") && !passengers.equals("")) {
                        int passCount = Integer.parseInt(passengers);
                        if (passCount > 0 && passCount <= 360) {
                            count++;
                            passWithAdd += passCount;
                        }
                    }
                }
                if (count > 0) {
                    passAvg = passWithAdd / count;

                    if (passAvg >= mostPass) {
                        mostPass = passAvg;
                        mostPassCompany = companyName;
                    }

                    System.out.printf("%s: %.0f passengers.%n", companyName, Math.floor(passAvg));
                }
            }
            System.out.printf("%s has most passengers per flight: %.0f", mostPassCompany, Math.floor(mostPass));
        }
    }
}
