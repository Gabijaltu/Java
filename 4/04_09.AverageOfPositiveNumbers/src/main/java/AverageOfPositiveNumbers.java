
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double count = 0;

        while (givenNumber != 0) {
            if (givenNumber > 0) {
                sum = sum + givenNumber;
                count = count + 1;
                givenNumber = Integer.parseInt(scanner.nextLine());
            } else {
                givenNumber = Integer.parseInt(scanner.nextLine());
            }
        }

        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = sum / count;
            System.out.println(average);
        }


    }
}
