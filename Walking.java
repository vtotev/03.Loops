import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int steps = 0;
        int goalSteps = 10000;

        while (steps < goalSteps) {
            String input = scan.nextLine();
            if (input.equals("Going home")) {
                input = scan.nextLine();
                steps += Integer.parseInt(input);
                break;
            } else {
                steps += Integer.parseInt(input);
            }
        }

        if (steps >= goalSteps) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", steps - goalSteps);
        } else {
            System.out.printf("%d more steps to reach goal.", goalSteps - steps);
        }
    }
}
