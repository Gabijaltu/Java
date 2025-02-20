
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        int givenNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        while (givenNumber != 0) {
            System.out.println("Give a number:");
            sum = sum + givenNumber;
            count = count + 1;
            givenNumber = Integer.parseInt(scanner.nextLine());

        }

        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
