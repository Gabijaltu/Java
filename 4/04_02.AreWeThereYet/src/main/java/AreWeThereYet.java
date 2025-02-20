
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");

        int givenNumber = Integer.parseInt(scanner.nextLine());

        while (givenNumber != 4) {
            System.out.println("Give a number");
            givenNumber = Integer.parseInt(scanner.nextLine());
        }
    }
}
