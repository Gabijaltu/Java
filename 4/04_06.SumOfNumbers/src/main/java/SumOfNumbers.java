
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        int givenNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (givenNumber != 0) {
            System.out.println("Give a number:");
            sum = sum + givenNumber;
            givenNumber = Integer.parseInt(scanner.nextLine());

        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
