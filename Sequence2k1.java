import java.util.Enumeration;
import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = Integer.parseInt(scan.nextLine());
        int n1 = 0;
        while (n1 < numb) {
            n1 = 2*n1+1;
            if (n1 <= numb) {
            System.out.println(n1); }
        }
    }
}
