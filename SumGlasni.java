import java.util.Scanner;

public class SumGlasni {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String duma = scan.nextLine();
        int points = 0;
        for (int i = 0; i < duma.length(); i++) {
            char bukva = duma.charAt(i);
            switch (bukva) {
                case 'a': points += 1; break;
                case 'e': points += 2; break;
                case 'i': points += 3; break;
                case 'o': points += 4; break;
                case 'u': points += 5; break;
            }
        }
        System.out.println(points);

    }
}
