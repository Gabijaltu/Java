
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sumOfNumbers = firstNumber + secondNumber;
        int differenceOfNumbers = firstNumber - secondNumber;
        int productOfNumbers = firstNumber * secondNumber;
        double firstDouble = Double.valueOf(firstNumber);
        double secondDouble = Double.valueOf(secondNumber);
        double quotientOfNumbers = firstDouble / secondDouble;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sumOfNumbers);
        System.out.println(firstNumber + " - " + secondNumber + " = " + differenceOfNumbers);
        System.out.println(firstNumber + " * " + secondNumber + " = " + productOfNumbers);
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotientOfNumbers);
    }
}
