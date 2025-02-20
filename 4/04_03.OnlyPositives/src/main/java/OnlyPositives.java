
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        int givenNumber = Integer.parseInt(scanner.nextLine());

        while (givenNumber != 0) {
            if (givenNumber > 0) {
                int poweredByTwo = givenNumber * givenNumber;
                System.out.println(poweredByTwo);
                System.out.println("Give a number:");
                givenNumber = Integer.parseInt(scanner.nextLine());
            } else {
                System.out.println("Unsuitable number");
                System.out.println("Give a number:");
                givenNumber = Integer.parseInt(scanner.nextLine());
            }
        }
    }
}
