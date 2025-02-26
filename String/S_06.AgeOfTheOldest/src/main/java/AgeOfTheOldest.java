
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = 0;

        while (true) {
            String nameAndAge = String.valueOf(scanner.nextLine());

            if (nameAndAge.isEmpty()) {
                break;
            }

            String[] nameAge = nameAndAge.split(",");

            String name = nameAge[0];

            Integer age = Integer.valueOf(nameAge[1]);

            if (maxAge < age)
                maxAge = age;

        }

        System.out.println("Age of the oldest: " + maxAge);

    }
}
