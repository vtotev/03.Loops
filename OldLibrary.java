import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();
//        int libCount = Integer.parseInt(scan.nextLine());
        int count = 0;
        boolean isFound = false;
        String book = scan.nextLine();
        while (!book.equals("No More Books")) {
            if (book.equals(bookName)) {
                isFound = true;
                break;
            }
            count++;
            book = scan.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", count);
        } else System.out.printf("The book you search is not here!%nYou checked %d books.", count);
    }
}
