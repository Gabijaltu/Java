
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String givenString = scan.nextLine();
        System.out.println("Give an integer:");
        String givenInteger = scan.nextLine();
        int intGiven = Integer.parseInt(givenInteger);
        System.out.println("Give a double:");
        String givenDouble = scan.nextLine();
        double doubleGiven = Double.parseDouble(givenDouble);
        System.out.println("Give a boolean:");
        String givenBoolean = scan.nextLine();
        boolean booleanGiven = Boolean.valueOf(givenBoolean);
        System.out.println("You gave the string " + givenString);
        System.out.println("You gave the integer " + intGiven);
        System.out.println("You gave the double " + doubleGiven);
        System.out.println("You gave the boolean " + booleanGiven);
    }
}
