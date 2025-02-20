
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        int givenNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (givenNumber != 0) {
            System.out.println("Give a number:");
            givenNumber = Integer.parseInt(scanner.nextLine());
            count = count + 1;
        }

        System.out.println("Number of numbers: " + count);
    }
}
