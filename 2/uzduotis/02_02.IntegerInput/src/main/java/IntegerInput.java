
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        String input = scanner.nextLine();
        int givenNumber = Integer.parseInt(input);
        System.out.println("You gave the number " + givenNumber);
    }
}
