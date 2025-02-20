
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        int givenNumber = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double count = 0;

        while (givenNumber != 0) {
            System.out.println("Give a number:");
            sum = sum + givenNumber;
            count = count + 1;
            givenNumber = Integer.parseInt(scanner.nextLine());

        }

        double average = sum / count;

        System.out.println("Average of the numbers: " + average);
    }
}
