
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int givenNumber = Integer.parseInt(scanner.nextLine());
        int factorial = 1;

        for (int i = 1; i <= givenNumber; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial: " + factorial);
    }
    }

