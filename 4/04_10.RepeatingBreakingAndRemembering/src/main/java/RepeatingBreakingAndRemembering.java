
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here...
        System.out.println("Give numbers:");
        //int givenNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;


        while (true) {
            int givenNumber = Integer.parseInt(scanner.nextLine());
            if (givenNumber == -1) {
                break;
            }
            if (givenNumber % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            sum += givenNumber;
            count++;

        }
        double sumDouble = sum;
        double countDouble = count;
        double average = sumDouble / countDouble;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }
}
