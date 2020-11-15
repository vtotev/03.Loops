import java.util.Scanner;

public class EvenPowersOf2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int numb = Integer.parseInt(scan.nextLine());
            int step = 1;
        for (int i = 0; i <= numb; i += 2) {
            System.out.println(step);
            step = step * 2 * 2;
        }
    }
}
