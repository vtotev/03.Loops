import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = Integer.parseInt(scan.nextLine());
        int input = Integer.parseInt(scan.nextLine());
        int sum = input;
        while (sum < numb) {
            input = Integer.parseInt(scan.nextLine());
            sum += input;
        }
        System.out.println(sum);
    }
}
