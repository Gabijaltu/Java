import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, pages, publicationYear);
            books.add(book);

        }
        System.out.print("What information will be printed? ");

        String answer = scanner.nextLine();

        for (Book book : books) {
            if (answer.equals("everything")) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            } else if (answer.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
