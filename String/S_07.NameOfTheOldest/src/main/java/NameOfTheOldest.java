
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String name = "";

        while (true) {
            String nameAndAge = String.valueOf(scanner.nextLine());

            if (nameAndAge.isEmpty()) {
                break;
            }

            String[] nameAge = nameAndAge.split(",");

            Integer age = Integer.valueOf(nameAge[1]);

            if (maxAge < age) {
                maxAge = age;
                name = nameAge[0];
            }
        }

        System.out.println("Name of the oldest: " + name);

    }
}
