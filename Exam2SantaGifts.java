import java.util.Scanner;

public class Exam2SantaGifts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int M = Integer.parseInt(scan.nextLine());
        int S = Integer.parseInt(scan.nextLine());

        for (int i = M; i >= N; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (i == S) {
                    break;
                }
                System.out.printf("%d ", i);
            }
        }
    }
}
